package DSA.algorithms.palindrome;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter a word: ");
    String word = s.nextLine();
    String modWord = word.toLowerCase().trim().replaceAll(" ", "");  
    char[] modWordCharArr = modWord.toCharArray();
    String reverseModWord = "";

    for (char c: modWordCharArr) reverseModWord = c + reverseModWord;
    
    String res = modWord.equals(reverseModWord) ? "is" : "isn't";

    System.out.println(word + " " + res + " palindrome");

    s.close();
  }
}
