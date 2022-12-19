package Generics.InterfaceType;

//Bu classı Generic yapmak istemiyorum ama generic interface den türetmek istiyorum
public class GenericClassStringImpl implements GenericInterface<String> {//Buraya type'ı belli edersek sorunu çözmüş oluruz


    @Override
    public void setValue(String s) {

    }

    @Override
    public String getValue() {
        return null;
    }
}
