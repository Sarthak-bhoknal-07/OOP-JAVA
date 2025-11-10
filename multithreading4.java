// Constructors in Thread class
// Thread()	-> Creates empty thread
// Thread(Runnable r)	-> Creates thread from Runnable object
// * Thread(Runnable r, String name)	-> Creates thread with name
// Thread(String name)	-> Creates named thread

class myThread implements Runnable {
    public void run() {
        System.out.println("this is thread");
    }
}

public class multithreading4 {
    public static void main(String[] args) {
        myThread task = new myThread();

        Thread t1 = new Thread(task, "Sarthak");
        t1.start();
        System.out.println("Thread name is " + t1.getName());
        System.out.println("Thread id is " + t1.getId());
    }
}
