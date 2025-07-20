// Method Overriding - the child class implements the same method present in the parent class again
// same method signature (name + parameters).

// Method Overriding Rules
// 1 Same name + same parameters
// 2 Must be in child class
// 3 Can't reduce access (public → can't be private)
// 4 Return type must match (or subclass)
// 5 Can't override static, final, or private methods
// 6 Use @Override to avoid mistakes

class baap {
    int acrsOfLand;

    public void business() {
        System.out.println("father having business of chai");
    }

    public void setLand(int i) {
        this.acrsOfLand = i;
    }

    public int getProperty() {
        return acrsOfLand;
    }
}

class beta extends baap {
    int newland;

    public void business() {
        System.out.println("beta also having business of coffie it's beta's personal business");
    }

    public void setLand(int n) {
        this.newland = n;
    }

    public int getProperty() {
        return newland;
    }
}

public class inheritance7MO {
    public static void main(String args[]) {
        baap b1 = new baap();
        b1.setLand(5);
        System.out.println("Baap's land " + b1.getProperty() + " acrs");
        b1.business();

        beta b1Beta = new beta();
        b1Beta.setLand(2);
        System.out.println("beta's land which he bought: " + b1Beta.getProperty() + " acrs");
        b1Beta.business();
    }
}
