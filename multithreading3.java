// Constructors in Thread class
// Thread()	-> Creates empty thread 
// Thread(Runnable r)	-> Creates thread from Runnable object
// Thread(Runnable r, String name)	-> Creates thread with name
// * Thread(String name)	-> Creates named thread

class myThr extends Thread {
    public myThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This is a Thread");
    }
}

public class multithreading3 {
    public static void main(String[] args) {
        myThr t1 = new myThr("Sarthak");
        t1.start();
        System.out.println("The Thread name is " + t1.getName());
        System.out.println("The Thread id is " + t1.getId());

        myThr t2 = new myThr("Sam");
        t2.start();
        System.out.println("The Thread name is " + t2.getName());
        System.out.println("The Thread id is " + t2.getId());
    }
}
