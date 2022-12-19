package Serialization;

import java.io.*;

public class Deneme {
    public static void main(String[] args) {
        writeObjectss();
    }
    private static void writeObjectss() {
        System.out.println("User Objeleri oluşturuluyor");
        //Mesela harddiske yazılmasını istediğim dataları oluşturdum
        Userr user11 = new Userr(1L, "Yunus", "4587985644");
        Userr user22 = new Userr(2L, "Yusuf", "4514585644");
        Userr user33 = new Userr(3L, "Betül", "5247985644");

        FileOutputStream fos1;
        try {
            fos1 = new FileOutputStream("userr.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
            oos1.writeObject(user11);
            oos1.writeObject(user22);
            oos1.writeObject(user33);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        /*try(FileOutputStream fos = new FileOutputStream("user.dat")){ // bu dosya yazmak için
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){ // bu Objeleri yazmak için
                oos.writeObject(user11);
                oos.writeObject(user22);
                oos.writeObject(user33);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

}
class Userr implements Serializable {

    // private field
    private Long id;
    private String name ;
    private String tcKimlikNo ;

    //const.
    public Userr(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }

    // Getter-Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    // toString

    @Override
    public String toString() {
        return "Userr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }
}