package gr11review.part1;

import java.io.*;
import java.text.NumberFormat;
import java.text.*;

public class Review6{
  public static void main(String[] args) throws IOException{
  
    NumberFormat priceFormat = new DecimalFormat("###,###,##0.00");

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    double itemPrice = 0;
    double subtotal = 0;
    double tax = 0;
    double total = 0;
    int itemCount = 0;

    while (itemPrice != 0){
      itemCount++;

      System.out.print("Enter the price for item " + itemCount + ": ");
      itemPrice = Double.parseDouble(key.readLine();

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