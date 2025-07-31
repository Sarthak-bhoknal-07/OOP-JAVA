// Encapsulation = Data Hiding + Controlled Access using methods
// Private fields (like password) cannot be accessed directly.
// Use getter and setter methods to access or modify them safely.

class Account {
    int id;
    String accHolderName;
    private String password;

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }
}

public class revision1 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.id = 101;
        a1.accHolderName = "Sahil";
        // a1.password = "SahilsPass";// we can't direct access private properties
        a1.setPassword("Sahil@07");
        System.out.println("Acc Id " + a1.id);
        System.out.println("Acc name " + a1.accHolderName);
        System.out.println("Password " + a1.getPassword());
    }
}

// Why make variables private?
// To hide sensitive data (like a password).
// To control how data is set or retrieved (validation, security checks).
// Prevents accidental changes from outside the class.

// Why use Getters and Setters?
// Getter: Allows safe and controlled read access to private data.
// Setter: Allows safe and controlled write/update access to private data.
// Example: You could add logic in setPassword() to ensure the password meets a
// certain length or contains special characters.