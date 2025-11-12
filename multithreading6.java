// Thread Methods
// t1.join() -> waits for another method to finish
class thr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("this is thread of process 1");
            i++;
        }
    }
}

class thr2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("this is thread of process 2");
            i++;
        }
    }
}

public class multithreading6 {
    public static void main(String[] args) {
        thr1 t1 = new thr1();
        t1.start();

        thr2 th2 = new thr2();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        th2.start();
    }
}
