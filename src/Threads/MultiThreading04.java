package Threads;//17.12.2022

/*Bu classta start ve enTime  a join metodunun etkisini inceledik. Thread2 bitmeden

 */
public class MultiThreading04 {
    public static void main(String[] args) {

        Bracket2 bracket2 = new Bracket2();
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 7; i++) {
                    bracket2.generateBrackets();
                }
            }
        });
        thread1.start();
        //threat 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 7; i++) {
                    bracket2.generateBrackets();
                }
            }
        });
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Toplam geçen süre : " + (endTime - startTime));
    }

}

class Bracket2 {
    public synchronized void generateBrackets() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                if (i <= 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
        }
        // en of for
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
