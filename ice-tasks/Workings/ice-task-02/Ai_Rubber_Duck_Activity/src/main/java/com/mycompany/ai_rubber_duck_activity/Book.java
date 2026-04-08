package com.mycompany.ai_rubber_duck_activity;

public class Book {
    
    //Two private fields for title and price
    private String title;
    private double price;
    
    //Constrictor - Peramiterised constructor 
    public Book(String title, double price){
        this.title = title;
        this.price = price;  
    }
    
    // Getter for title
    public String getTitle() {
        return title;
    }
    
    // Setter for price with if statment to only allow positive numbers
    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Please only use positve values.");
        }
    }
    
    
    
    
    
    
}
