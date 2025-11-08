package com.mycompany.rectangle;

public class Rectangle {

    
    private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    public Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

   
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println();
    }

    
    public static void main(String[] args) {
       
        Rectangle rect1 = new Rectangle(10.5, 5.2);

      
        Rectangle rect2 = new Rectangle(rect1);

       
        System.out.println("Rectangle 1:");
        rect1.display();

        System.out.println("Rectangle 2 (Copied from Rectangle 1):");
        rect2.display();
    }
}
