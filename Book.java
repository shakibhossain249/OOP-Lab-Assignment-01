package com.mycompany.book;

public class Book {

    
    private String title;
    private String author;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        Book book1 = new Book("The Alchemist", "Paulo Coelho");

       
        Book book2 = new Book("Unknown Tales");

       
        book1.display();
        book2.display();
    }
}
