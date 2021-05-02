package gr11review.part1;

import java.io.*;

/**
  * Simulates 1000 pulls of a slot machine and prints them
  * Counts triples and prints them
  * @author: P.Tran
  */

public class Review8{
  public static void main(String[] args) throws IOException{
    
    int tripleCount = 0;
    int slot1 = 0;
    int slot2 = 0;
    int slot3 = 0;

    for (int i = 0; i < 1000; i++){
      //Generates random numbers
      slot1 = (int)(Math.random() * 9);
      slot2 = (int)(Math.random() * 9);
      slot3 = (int)(Math.random() * 9);

      //Prints random numbers
      System.out.print(slot1 + " ");
      System.out.print(slot2 + " ");
      System.out.println(slot3 + " ");

      //Counts triples
      if (slot1 == slot2 && slot1 == slot3){
        tripleCount++;
      }
    }
    
    //Prints triples
    System.out.println(tripleCount);
  }
}