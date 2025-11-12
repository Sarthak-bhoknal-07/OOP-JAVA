// Thread prorities
// Thread priority tells JVM which thread is more important (not guaranteed).
// Thread.MIN_PRIORITY	-> 1
// Thread.NORM_PRIORITY	-> 5 (default)
// Thread.MAX_PRIORITY	-> 10

class Mythr1 implements Runnable {
    String name;

    public Mythr1(String name) {
        this.name = name;
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread " + name);
            i++;
        }
    }
}

public class multithreading5 {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Sarthak");
        Mythr1 t2 = new Mythr1("Rohan");
        Mythr1 t3 = new Mythr1("Prasad");
        Thread Thread1 = new Thread(t1);
        Thread Thread2 = new Thread(t2);
        Thread Thread3 = new Thread(t3);
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread1.setPriority(Thread.MAX_PRIORITY);
        Thread2.setPriority(Thread.MIN_PRIORITY);
        Thread3.setPriority(Thread.MIN_PRIORITY);
    }
}
