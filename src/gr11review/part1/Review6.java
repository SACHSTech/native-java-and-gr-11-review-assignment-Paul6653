package gr11review.part1;

import java.io.*;
import java.text.NumberFormat;
import java.text.*;

/**
  * Asks for price of items until a zero input
  * Calculates subtotal, tax, and total of items
  * @author: P.Tran
  */

public class Review6{
  public static void main(String[] args) throws IOException{
  
    NumberFormat priceFormat = new DecimalFormat("###,###,##0.00");

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    double itemPrice = 1;
    double subtotal = 0;
    double tax = 0;
    double total = 0;

    //Inputs item prices until a zero input
    while (itemPrice != 0){
      System.out.print("Enter the price for an item: ");
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