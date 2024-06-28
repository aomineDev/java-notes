package DSA.algorithms.reverseString;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    String reverseWord = "";
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter a word: ");
    String word = s.nextLine();
    char[] wordCharArr = word.toCharArray();

    for (char c: wordCharArr) reverseWord = c + reverseWord;
    
    System.out.println("The reverse word is: " + reverseWord);

    s.close();
  }  
}
