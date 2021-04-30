package gr11review.part1;

import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{

    //prints odd numbers from 20 to 100
    for (int i = 21; i <= 100; i = i + 2){
      System.out.println(i);
    }

    //blank line
    System.out.println("");

    //prints numbers from 29 to 2 in descending order
    for (int i = 29; i >= 2; i--){
      System.out.println(i);
    }
  }
}