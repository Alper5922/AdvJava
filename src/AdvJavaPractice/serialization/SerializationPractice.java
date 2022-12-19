package AdvJavaPractice.serialization;

import java.io.*;

/*
TASK : Book tipinde nersneler üretip bu nersneleri books.txt dosyasına kaydedin ve daha sonra bu dosyadan nesnelri okuyun
 */
public class SerializationPractice {
    public static void main(String[] args) {
       // writeObject();
        readObject();
    }

    public static void writeObject() {
        Book book1 = new Book("Sefiller", "Victo Hugo", 1945);
        Book book2 = new Book("Suç ve Ceza", "Dostoyevski", 1945);
        Book book3 = new Book("Savaş ve Barış", "Victo Hugo", 1945);

        try {
            FileOutputStream fis = new FileOutputStream("book.txt");
            ObjectOutputStream write = new ObjectOutputStream(fis);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static void readObject(){

        try {
            FileInputStream fis = new FileInputStream("book.txt");
            ObjectInputStream read = new ObjectInputStream(fis);
            Book book1 = (Book) read.readObject();
            Book book2 = (Book) read.readObject();
            Book book3 = (Book) read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            read.close();
            fis.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
