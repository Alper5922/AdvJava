package AdvJavaPractice.generics.classes.interfaces;

//CRUD metotları oluşturan generic br interface tanımlayınzı
public interface Repository<T> {
    void add(T t);
    void get(T t);
    void update(T t);
    void delete(T t);

}
