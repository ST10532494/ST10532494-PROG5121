package com.mycompany.activity._daily_water_intake_tracker;

import java.util.Scanner;

public class Activity_01_Daily_Water_Intake_Tracker {
    
    //There are all the variables
    static int morning;
    static int afternoon;
    static int evening;
    static int total;
    static Scanner userInput = new Scanner(System.in); //explain- Used here so all three methods can use it 
    
    //This gathers all the inputs
    static void getInput(){
            System.out.println("Enter number of glasses of water in the morning: ");
            morning = userInput.nextInt();
            
            System.out.println("Enter number of glasses of water in the afternoon: ");
            afternoon = userInput.nextInt();
            
            System.out.println("Enter number of glasses of water in the evening: ");
            evening = userInput.nextInt(); 
        }
    
    //This manages doing the calculations
    static void calculateTotal(){
        total = morning + afternoon + evening;
    }
    
    //This manages displaying the results
    static void displayResult(){
        System.out.println("Total glasses consumed today: " + total);
    }

    //This pulls it all together
    public static void main(String[] args) {
        getInput();
        calculateTotal();
        displayResult();
        
    }
}