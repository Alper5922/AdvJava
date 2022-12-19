package Generics.InterfaceType;

//Eğer bir "Generic interface" implement ederseniz, class'da Generic olmalı
public  class GenericClassImpl<T> implements GenericInterface<T> {

    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
