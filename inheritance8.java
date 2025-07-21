// Dynamic method dispatch

class phone {
    public void showTime() {
        System.out.println("Showing time...");
    }

    public void on() {
        System.out.println("Turing On phone...");
    }
}

class smartphone extends phone {
    public void music() {
        System.out.println("playing music...");
    }

    public void on() {
        System.out.println("Turning On smartphone...");
    }
}

public class inheritance8 {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.showTime();
        sp.music();
        sp.on(); // overridden method in smartphone

        // A superclass reference (phone) is pointing to a subclass object (smartphone).
        phone p = new smartphone();
        p.showTime(); // method in phone
        // p.music(); // ERROR-p is a reference of phone,& music() does NOT exist in
        // phone.
        p.on(); // overridden method in smartphone will execute
    }
}

// Reference - Determines what methods can be called (at compile time)
// Actual object - Determines which method version runs (at runtime)