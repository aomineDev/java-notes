package DSA.algorithms.asciiCode;

import java.util.Scanner;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a word in lower case: ");
    String wordOne = s.nextLine();
    System.out.println("Enter a word in upper case: ");
    String wordTwo = s.nextLine();
    
    char[] wordOneChar = wordOne.toLowerCase().toCharArray();
    char[] wordTwoChar = wordTwo.toUpperCase().toCharArray();

    int[] wordOneAscii = new int[wordOneChar.length];
    int[] wordTwoAscii = new int[wordTwoChar.length];
  
    System.out.println("word in lower case - ascii codes \"" + wordOne.toLowerCase() + "\"");
    for (int i = 0; i < wordOneChar.length; i++) {
      wordOneAscii[i] = wordOneChar[i];
      System.out.println(wordOneChar[i] + ": " + wordOneAscii[i]);
    }

    System.out.println("word in upper case - ascii codes \"" + wordTwo.toUpperCase() + "\"");
    for (int i = 0; i < wordTwoChar.length; i++) {
      wordTwoAscii[i] = wordTwoChar[i];
      System.out.println(wordTwoChar[i] + ": " + wordTwoAscii[i]);
    }

    int iOneMa = 0;
    int iOneMe = 0;
    int iTwoMa = 0;
    int iTwoMe = 0;

    for (int i = 1; i < wordOneAscii.length; i++) {
      if (wordOneAscii[i] >= wordOneAscii[iOneMa]) iOneMa = i;
      if (wordOneAscii[i] <= wordOneAscii[iOneMe]) iOneMe = i;
    }

    for (int i = 1; i < wordTwoAscii.length; i++) {
      if (wordTwoAscii[i] >= wordTwoAscii[iTwoMa]) iTwoMa = i;
      if (wordTwoAscii[i] <= wordTwoAscii[iTwoMe]) iTwoMe = i;
    }

    System.out.println("lower case - major ascii code: " + wordOneAscii[iOneMa] + " (" + wordOneChar[iOneMa] + ")");
    System.out.println("lower case - minor ascii code: " + wordOneAscii[iOneMe] + " (" + wordOneChar[iOneMe] + ")");

    System.out.println("capital letter - major ascii code: " + wordTwoAscii[iTwoMa] + " (" + wordTwoChar[iTwoMa] + ")");
    System.out.println("capital letter - minor ascii code: " + wordTwoAscii[iTwoMe] + " (" + wordTwoChar[iTwoMe] + ")");

    s.close();
  }
}
