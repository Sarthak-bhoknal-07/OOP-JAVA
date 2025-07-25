// interface - An interface in Java is a blueprint of a class. It is a reference type, similar to a class, but it only contains abstract methods (until Java 8) and constants.
// Basic Implementation

interface vehicle {
    public void start();

    public String stop();
}

// Class bike implements the vehicle interface.
// It must override the abstract methods of interface:
class bike implements vehicle {
    public void start() {
        System.out.println("Starting the bike..");
    }

    public String stop() {
        return "Stopping the bike..";
    }

    public void fuelType() {
        System.out.println("this is petrol bike");
    }
}

public class interface1 {
    public static void main(String[] args) {
        bike b = new bike();
        b.start();
        System.out.println(b.stop());
        b.fuelType();

        // dynamic method dispatch / runtime polymorphism
        vehicle v = new bike();
        v.start();
        System.out.println(v.stop());
        // v.fuelType();// ERROR NOT ALLOWED
        // v is of type vehicle,so you can only call methods defined in the vehicle
        // interface.
        // fuelType() is not in the interface, so Java gives a compile-time error.

        // vehicle v = new vehicle(); can not create the object of interface
        // Interfaces cannot be instantiated directly
    }
}
