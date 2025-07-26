// Default methods in interface (Java 8 method) + Private methods inside interfaces + Overriding default methods in implementing class

// Java 8 introduced default methods in interfaces.
// It allows interfaces to have concrete methods (with body).
// These methods can be used directly by implementing classes without overriding.

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

interface wifi {
    String[] getNetworks();

    void connectToWifi();

    // 🔒 Private method: can only be used inside this interface
    private void greet() {
        System.out.println("Hello user");
    }

    // ✅ Default method: has a body and can be inherited directly
    default void connectRecentNet() {
        greet(); // private method call inside same interface is valid
        System.out.println("Connecting to the recently connected network..");
    }
}

interface camara {
    void clickphoto();

    default void record4Kvideo() {
        System.out.println("Recording 4k video in camara..");
    }
}

class DSLR implements camara, wifi {
    public String[] getNetworks() {
        String[] networks = { "Ezinet", "sarthak", "abhi" };
        return networks;
    }

    public void connectToWifi() {
        System.out.println("Connecting to the wifi..");
    }

    public void clickphoto() {
        System.out.println("clicking photo..");
    }

    // ✅ Overriding default method from camara (optional)
    public void record4Kvideo() {
        System.out.println("Recording 4k video in DSLR..");
    }

    // ✅ Note: No need to/ Can be override default methods `connectRecentNet()` or
    // `record4Kvideo()`
    // They will be inherited and available directly
}

public class interface7 {
    public static void main(String[] args) {
        DSLR d1 = new DSLR();
        d1.clickphoto();
        d1.connectRecentNet(); // ✅ Default method from wifi interface
        String[] nets = d1.getNetworks();
        // System.out.println(Arrays.toString(nets));
        for (String ele : nets) {
            System.out.println(ele);
        }
        d1.connectToWifi();
        d1.clickphoto();
        d1.record4Kvideo(); // Overridden default method from camara
    }
}