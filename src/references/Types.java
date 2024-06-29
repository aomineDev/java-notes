package references;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Types {
  public static void main(String[] args) {
    // First Type - lambda function that returns a method
    Function<Double, Double> getSqrtWithLambda = (number) -> Math.sqrt(number);
    Function<Double, Double> getSqrt = Math::sqrt;

    System.out.println("The square of 9 is: " + getSqrtWithLambda.apply(9.0));
    System.out.println("The square of 25 is: " + getSqrt.apply(25.0));

    // Second Type - lambda function that returns a constructor
    Supplier<Date> getDateWIthLambda = () -> new Date();
    Supplier<Date> getDate = Date::new; 
    
    System.out.println("Fecha: " + getDateWIthLambda.get());
    System.out.println("Fecha: " + getDate.get());
    
    // Third Type - lambda function that returns a method for an object
    String hello = "Hello";

    Predicate<String> startsWithHWithLambda = (str) -> hello.startsWith(str);
    Predicate<String> startsWithH = hello::startsWith;

    System.out.println(hello + " starts with h?: " + startsWithHWithLambda.test("h"));
    System.out.println(hello + " starts with H?: " + startsWithH.test("H"));

    // Fourth Type - lambda function that returns a method of an object passed by parameter
    Function<String, Integer> getLengthWithLambda = str -> str.length();
    Function<String, Integer> getLength = String::length;

    System.out.println("Lenght of \"Hello\": " + getLengthWithLambda.apply("Hello"));
    System.out.println("Lenght of \"World!\": " + getLength.apply("World!"));
  }
}

