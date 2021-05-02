package gr11review.part1;

import java.io.*;

public class Review7{
  public static void main(String[] args) throws IOException{
    
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    String theSentence = key.readLine();

    int sentenceLength = theSentence.length();
    int spaceCount = 0;
    int aCount = 0;
    String oddChars = "";

    //Prints number of chars
    System.out.println("There are " + sentenceLength + " characters in the sentence.");

    //Counts number of spaces
    for (int i = 0; i < sentenceLength; i++){
      if (theSentence.charAt(i) == ' '){
        spaceCount++;
      }
    }

    //Prints number of spaces
    System.out.println("There are " + spaceCount + " spaces in the sentence.");

    //Counts number of a's
    for (int i = 0; i < sentenceLength; i++){
      if (theSentence.charAt(i) == 'a'){
        aCount++;
      }
    }

    //Prints number of a's
    System.out.println("There are " + aCount + " letter a in the sentence.");

    //Creates string with odd characters and prints it
    for (int i = 0; i < Math.ceil(sentenceLength / 2.0); i++){
      oddChars = oddChars + "-";
    }

    System.out.println(oddChars);
  }
}