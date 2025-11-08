
package com.mycompany.dog;

public class Dog {

    
    private String name;
    private String color;

    
    public Dog(String name, String color) {
        this.name = name;  
        this.color = color;
    }

 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Buddy", "Brown");

        
        dog1.display();
    }
}
