package DSA.algorithms.validEmail;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter an email:");
    String email = s.nextLine();
    String regex = "^[a-z0-9_.-]+@[a-z.-]+\\.[a-z]{2,}$";

    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
    String isValid = matcher.matches() ? "is" : "isn't";

    System.out.println("The email " + isValid + " valid");

    s.close();
  }
}
