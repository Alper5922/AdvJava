package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType<T> {
    /*
    E--> Element, collection gibi yapılarda kullanılır
    K--> Key
    V--> Value
    N --> Number
    T--> Type
    S,U,V  vb --> 2. , 3., 4. tipler için
     */
    private T type;  // field = variable demektir

    //Getter Setter
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        //generic yapı kullanılarak aynı classtan 2 farklı data türünden OBJE oluşturalım
        GenericType<String> obj1 = new GenericType<>();
        // NOT : Diamond içine non-primitive type kullanmalıyız
        obj1.setType("Generic Types");

        GenericType<String> obj2 = new GenericType<>();
        //obj2.setType(65);   //String girmem gerekirken INT data türü girince CTE verdi

        // NOT : Cast probleminden nasıl kurtuldum

        GenericType<Integer> obj3 = new GenericType<>();
        obj3.setType(65);
        int a = obj3.getType(); // !! Cast probleminden kurtulduk

        //NOT : ClassCastException probleminden kurtulma
        List<String> list = new ArrayList<>();
        list.add("Alper");
        list.add("Halide");
        //list.add(25); // ClassCastException dan kurtulduk

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Generic");
        //map.put("Genreric",1);

    }
}
