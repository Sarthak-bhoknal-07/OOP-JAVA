// Multithreading - there is two ways to create thread in java
// 1. By extending ' Thread ' class

// Example - you doing cooking and chatting concurrently
class myThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 1 for Cooking");
            i++;
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 2 for Chatting");
            i++;
        }
    }
}

public class multithreading1 {
    public static void main(String arg[]) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
