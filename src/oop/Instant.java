package oop;

public class Instant {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 55000.0, 16, "Nagraj");
        laptop.details();
    }

    static class Laptop {
        String name;
        double price;
        int ram;
        String owner;

        Laptop(String name, double price, int ram, String owner) {
            this.name = name;
            this.price = price;
            this.ram = ram;
            this.owner = owner;
        }

        public void details() {
            System.out.println("Laptop Name: " + name);
            System.out.println("Laptop Price: " + price);
            System.out.println("Laptop RAM: " + ram + " GB");
            System.out.println("Laptop Owner: " + owner);
        }
    }
}
