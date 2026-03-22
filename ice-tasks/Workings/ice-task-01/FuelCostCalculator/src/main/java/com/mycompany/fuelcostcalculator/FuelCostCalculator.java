/*ICE Task One – Fuel Cost Calculator
 * @author jaysonigrec ST10532494
 * 
 * References:
 * Coding with John, 2020. How Do We Get User Input in Java? - Full Tutorial. [video online] Available at: <https://youtu.be/bI7kQq9cjmQ?si=_ZCBdK60EDNCI94z> [Accessed 22 March 2026]
 * Professor Hank Stalica, 2025. Java Formatting Output: printf and Format Specifiers (%s, %f, %d). [video online] Available at: <https://youtu.be/fhAOahZl1pA?si=sxaEu-j7O-sGoDow> [Accessed 22 March 2026]
 * VC Lecture Series, 2026. PROG5121 - Weekly Collab Session 2 (10-3-2026). [video online] Available at: <https://youtu.be/M0f6D5rfkMo?si=wTRQrCMwFNyLi3lY> [Accessed 22 March 2026]
 * w3schools, 2026. Java String format() Method. [online] Available at: <https://www.w3schools.com/java/ref_string_format.asp> [Accessed 22 March 2026]
 */

package com.mycompany.fuelcostcalculator;

import java.util.Scanner;

public class FuelCostCalculator {
    
    static Scanner Input = new Scanner(System.in);
    
    //Vaulues to be used 
    static double Distance;
    static double Consumption;
    static double Price;
    static double FuelNeeded;
    static double Cost;
    
    // Source: Coding with John, 2020
    /**
     * User input method
     * Consists of: 
     * do-while loop
     * try-catch (For when the user adds values like "70km" or "70Kilometers")
     */
    static void Input(){
        
        //Travel distance for the trip
        boolean validDoubleDistance = false;
        do{
            System.out.println("Please enter distance you are traveling in kilometers");
            String rawInput = Input.nextLine();
            double doubleDistance;
            try {
                doubleDistance = Double.parseDouble(rawInput);
                Distance = doubleDistance;
                validDoubleDistance = true;
            }
            catch(NumberFormatException nfe){
                System.out.println("Please use only numerical values");
            } 
        }
        while(validDoubleDistance == false);
        
        //Fuel consumption of the car
        boolean validDoubleConsumption = false;
        do{
            System.out.println("Please enter liter per kilometer consumption of your car");
            String rawInput = Input.nextLine();
            double doubleConsumption;
            try {
                doubleConsumption = Double.parseDouble(rawInput);
                Consumption = doubleConsumption;
                validDoubleConsumption = true;
            }
            catch(NumberFormatException nfe){
                System.out.println("Please use only numerical values");
            } 
        }
        while(validDoubleConsumption == false);
        
        //Price per litre of fuel 
        boolean validDoublePrice = false;
        do{
            System.out.println("Please enter price per liter of fuel");
            String rawInput = Input.nextLine();
            double doublePrice;
            try {
                doublePrice = Double.parseDouble(rawInput);
                Price = doublePrice;
                validDoublePrice = true;
            }
            catch(NumberFormatException nfe){
                System.out.println("Please use only numerical values");
            } 
        }
        while(validDoublePrice == false);    
    }
    
    // Source: VC Lecture Series, 2026.
    //Calculation for fuel required
    static void Calculations(){
        FuelNeeded = Distance/Consumption;
    }
    
    //Calculation for fuel cost
    static void FuelCost(){
        Cost = FuelNeeded*Price;  
    }
    
    
    // Source: Professor Hank Stalica, 2025.      
    // Source: w3schools, 2026.
    public static void main(String[] args) {
        //Calling methods
        Input();
        Calculations();
        FuelCost();
        
        //Outputs
        String outFuelNeeded = "Total fuel needed is: %.1fL";
        String resultFuelNeeded = String.format(outFuelNeeded, FuelNeeded);
        System.out.println(resultFuelNeeded);
        
        String outCost = "Total cost of fuel is: R%.2f";
        String resultCost = String.format(outCost, Cost);
        System.out.println(resultCost);
        
        //Scanner is closed
        Input.close(); 
    }
}
