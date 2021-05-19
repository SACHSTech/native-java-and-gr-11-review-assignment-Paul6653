package gr11review.part1;

import java.io.*;

/**
  * Takes month number and day number as input
  * Prints day of the year
  * @author: P.Tran
  */

public class Review1{
  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Input month number
    System.out.print("Enter the month number: ");
    int month = Integer.parseInt(key.readLine());

    //Input day of month
    System.out.print("Enter the day number: ");
    int day = Integer.parseInt(key.readLine());

    int dayNumber = 0;

    //convert month into #of days into the year
    if (month == 1){
      dayNumber = 0;
    } else if (month == 2){
      dayNumber = 31;
    } else if (month == 3){
      dayNumber = 59;
    } else if (month == 4){
      dayNumber = 90;
    } else if (month == 5){
      dayNumber = 120;
    } else if (month == 6){
      dayNumber = 151;
    } else if (month == 7){
      dayNumber = 181;
    } else if (month == 8){
      dayNumber = 212;
    } else if (month == 9){
      dayNumber = 243;
    } else if (month == 10){
      dayNumber = 273;
    } else if (month == 11){
      dayNumber = 304;
    } else if (month == 12){
      dayNumber = 334;
    } 

    //add day to dayNumber
    dayNumber = dayNumber + day;

    //print day of the year
    System.out.println(dayNumber);
  }
}