// Generics in java

// Generics class
class GenericsClass<T> {
    private T value;

    public void setter(T value) {
        this.value = value;
    }

    public T getter() {
        return value;
    }
}

// Generic interface
interface container<T> {
    void add(T item);

    T get();
}

class store<T> implements container<T> {
    private T valT;

    public void add(T valT) {
        this.valT = valT;
    }

    public T get() {
        return valT;
    }
}

public class Generics {
    public static <T> void display(T value) {
        System.out.println("value = " + value);
    }

    public static void main(String[] args) {
        // Generic class obj
        GenericsClass obj1 = new GenericsClass();
        obj1.setter(101);
        System.out.println(obj1.getter());

        System.out.println();
        // generic method calling (Method is static so NO need to create object)
        display("AnyType - e.g 101,string,etc");

        System.out.println();
        // store clas object which implements generic interface
        store objStore = new store();
        objStore.add(20.20);
        System.out.println(objStore.get());
    }
}
