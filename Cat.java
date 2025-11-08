
package com.mycompany.cat;

public class Cat {
    
    String name;
    int age;

    
    public Cat() {
        name = "TINTIN";
        age = 4;
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
        Cat cat1 = new Cat(); 
        cat1.display();
    }
}
