package polymorphism;

// Parent Class
class Hillstations {
    void famousFood() {
        System.out.println("Local hill station snacks.");
    }

    void famousFor() {
        System.out.println("Scenic beauty and weather.");
    }
}

// Subclass 1
class Manali extends Hillstations {
    @Override
    void famousFood() {
        System.out.println("Manali is famous for Siddu.");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for Adventure Sports.");
    }
}

// Subclass 2
class Mussoorie extends Hillstations {
    @Override
    void famousFood() {
        System.out.println("Mussoorie is famous for Aloo ke Gutke.");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for Kempty Falls.");
    }
}

// Subclass 3
class Gulmarg extends Hillstations {
    @Override
    void famousFood() {
        System.out.println("Gulmarg is famous for Wazwan.");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for Skiing and Gondola rides.");
    }
}

public class HillStationDemo {
    public static void main(String[] args) {
        // Parent class reference used to call overridden methods
        Hillstations place;

        System.out.println("--- Manali ---");
        place = new Manali();
        place.famousFood(); 
        place.famousFor();

        System.out.println("\n--- Mussoorie ---");
        place = new Mussoorie();
        place.famousFood(); 
        place.famousFor();

        System.out.println("\n--- Gulmarg ---");
        place = new Gulmarg();
        place.famousFood(); 
        place.famousFor();
    }
}