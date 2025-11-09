// Multithreading - there is two ways to create thread in java
// 1. By extending ' Thread ' class
// 2. By implementing Runnable interface

class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread 1 for bullet 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread 2 for bullet 2");
            i++;
        }
    }
}

public class multithreading2 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
