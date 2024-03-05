class Car {
    public void car() {
        System.out.println("Mercedes");
    }
}

class Truck {
    public void truck() {
        System.out.println("Tata");
    }
}

class Auto extends Truck {
    public void auto() {
        System.out.println("Piaggio");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Auto v = new Auto();
        v.car();   // Accessing method from Car class
        v.truck(); // Accessing method from Truck class
        v.auto();  // Accessing method from Auto class
    }
}

