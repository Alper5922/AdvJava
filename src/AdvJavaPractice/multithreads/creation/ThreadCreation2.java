package AdvJavaPractice.multithreads.creation;

import javax.swing.*;

public class ThreadCreation2 {
    /*Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
    bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.*/

    //TASK-3 : Threadler başlamadan önce Yarış başlasın ve bitince Yarış bitti yazdırın.
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter("1");
        Thread th1 = new Thread(c1);

        Counter c2 = new Counter("2");
        Thread th2 = new Thread(c2);

        System.out.println("Yarış başlasın");
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("Yarış bitti.....");
    }
}
class Counter implements Runnable{

    private String name;
    @Override
    public void run() {
        for(int i = 'a'; i<='z' ; i++ ){
            System.out.println(name +" "+ (char)i);
        }
    }

    public Counter(String name) {
        this.name = name;
    }

}
