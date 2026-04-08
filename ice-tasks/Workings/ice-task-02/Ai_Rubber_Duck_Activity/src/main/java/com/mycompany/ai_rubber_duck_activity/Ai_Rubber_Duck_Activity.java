/*ICE Task Two – AI Rubber Duck Activity
 * @author jaysonigrec ST10532494
 */

package com.mycompany.ai_rubber_duck_activity;

public class Ai_Rubber_Duck_Activity {

    public static void main(String[] args) {
        Book myBook = new Book("Atomic Habits", 345.95);
        System.out.println(myBook.getTitle());
        
        myBook.setPrice(199.99);  // valid - updates the price
        myBook.setPrice(-5);     // invalid - prints "Positive values only.
    }
}
