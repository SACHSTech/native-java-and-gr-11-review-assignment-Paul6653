package gr11review.part1;

import java.io.*;

public class Review2{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    //print menu
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");

    //Input menu choice
    System.out.print("Choose a menu option: ");
    String menuChoice = key.readLine();

    //print a different joke depending on menu choice
    switch (menuChoice){
      case "0":
        System.out.println("Why do bees have sticky hair?");
        System.out.println("They always use honeycombs.");
        break;
      case "1":
        System.out.println("Why do Canadian cowboys have sticky feet?");
        System.out.println("Maple Stirrups.");
        break;
      case "2":
        System.out.println("What kind of clothes do lawyers wear?");
        System.out.println("Lawsuits.");
        break;
      case "3":
        System.out.println("How is an English teacher like a judge?");
        System.out.println("They both give out sentences.");
        break;
      default:
        System.out.println("Invalid menu option");
    }
  }
}