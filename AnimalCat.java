class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}
