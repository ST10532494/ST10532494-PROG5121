package com.mycompany.activity._restaurant_bill_calculator;

import java.util.Scanner;

public class Activity_02_Restaurant_Bill_Calculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double mealPrice;
        double drinkPrice;
        double dessertPrice;
        
        
        
        
        
        
        System.out.println("Enter meal price:");
        mealPrice = input.nextDouble();
        
        System.out.println("Enter drink price:");
        drinkPrice = input.nextDouble();
        
        System.out.println("Enter dessert price:");
        dessertPrice = input.nextDouble();
        
        
        
        
        
        

        
        
    
    
        calculateTotal(double mealPrice, double drinkPrice, double dessertPrice);
        
    }
    public static void calculateTotal(double mealPrice, double drinkPrice, double dessertPrice) {
    double total = mealPrice + drinkPrice + dessertPrice;
    System.out.println("Total bill: R" + total);
}
    
    
    
}
