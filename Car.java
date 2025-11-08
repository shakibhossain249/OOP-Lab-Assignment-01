class Vehicle {
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
