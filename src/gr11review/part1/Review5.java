package gr11review.part1;

import java.io.*;

public class Review5{
  public static void main(String[] args) throws IOException{
    
    double yearlyInvested = 0;
    double interestRate = 0;
    double target = 0;
    double balance = 0; 
    int yearCount = 0;

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Asks for invested amount, interest rate, and target amount
    System.out.print("Enter the yearly invested amount: ");
    yearlyInvested = Double.parseDouble(key.readLine());
    System.out.print("Enter the compound interest rate: ");
    interestRate = Double.parseDouble(key.readLine());
    System.out.print("Enter the target amount: ");
    target = Double.parseDouble(key.readLine());

    //Calculates amount of years to earn target amount
    while (balance < target){
      balance = balance + yearlyInvested;
      balance = balance * (1 + (interestRate/100));

      yearCount++;
    }

    //Outputs amount of years to earn target amount
    System.out.println("The target amount will be earned in " + yearCount + " years.");
  }
}