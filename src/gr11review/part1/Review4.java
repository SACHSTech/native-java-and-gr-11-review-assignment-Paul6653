package gr11review.part1;

import java.io.*;
import java.text.NumberFormat;
import java.text.*;

/**
  * Asks how many items to purchase
  * Asks for prices of items one by one
  * Prints subtotal, tax, and total of items
  * @author: P.Tran
  */

public class Review4{
  public static void main(String[] args) throws IOException{
      
    int itemCount = 0;
    double itemPrice;
    double subtotal = 0;
    double tax;
    double total;

    NumberFormat priceFormat = new DecimalFormat("###,###,##0.00");
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //input amount of items bought
    System.out.print("How many items do you want to buy? ");
    itemCount = Integer.parseInt(key.readLine());

    //asks for price of items
    for (int i = 1; i <= itemCount; i++){
      System.out.print("Enter the price for item " + i + ": ");
      itemPrice = Double.parseDouble(key.readLine());

      subtotal = subtotal + itemPrice;
    }
      
    //calculate tax and total
    tax = subtotal * 0.13;
    total = subtotal * 1.13;

    //prints subtotal, tax, and total in correct format
    System.out.println("Subtotal: $" + priceFormat.format(subtotal));
    System.out.println("Tax: $" + priceFormat.format(tax));
    System.out.println("Total: $" + priceFormat.format(total));
  }

}