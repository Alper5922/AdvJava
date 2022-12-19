package Threads;// 16.12.2022
/*

1) Multithreading Programlama nedir?
    Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci

2) Threadler 2 şekilde oluşturulur:

        --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.

         --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
         ardından Thread sınıfının constructorına nesne olarak gönderilir.
2a) Hangi yöntem daha kullanışlı?
    Genellikle Runnable interfaceini implement ederek oluşturmak daha çok tercih
    edilir çünkü Javada sadece bir class extend edebiliriz bu hakkımızı Thread ile
    harcamak istemeyiz.

3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?

   Evet, ancak thread oluşturulmaz.

4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?

   Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.


*/
public class ThreadCreationWays {
    public static void main(String[] args) {
        //İlk çalışan thread main thread'dir
        System.out.println("Current Thread hangisi : " + Thread.currentThread().getName());

        MyThread thread1 = new MyThread();
        thread1.start(); //thread sınıfında run() metodunda yazılanlar işlenmeye başlar
        // thread1.run(); --> Bu şekiilde çağırmakla start() ile çağırmak arasında ki fark;
        // run() ile thread değişmez sadece method çalışır.
        // start() da ise  önce thread ayağa kalkar daha sonra içindeki  run() metodu çalışır


        //Myrunnable içindeki run() ı çalıştırıyoruz
        Myrunnable runnable = new Myrunnable();
        Thread thread2 = new Thread(runnable); // Start() metodu Thread classına ait olduğu için ilaveeten bu satırı yazmak zorunda kaldık
        thread2.start();

        // İSİMSİZ THREAD OLUŞTURMA, annonymous (Interface)
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        });


    }
}

//1.yol Thread classını extend ederek
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread threadı çalışıyor");
    }
}

//2.YOL : Runnable Interfaci implement ederek
class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Interface den türetilen  thread çalıştı");
    }
}
