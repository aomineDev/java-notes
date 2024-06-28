package DSA.algorithms.majorMediumMinor;

import java.util.Scanner;

public class Method1 {
 public static void main(String[] args) {
  int n1, n2, n3, nMajor, nMid, nMinor;
  Scanner s = new Scanner(System.in);

  n1 = s.nextInt();
  n3 = s.nextInt();
  n2 = s.nextInt();

  if (n1 >= n2 && n1 >= n3) {
    nMajor = n1;

    if (n2 <= n3) {
      nMinor = n2;
      nMid = n3;
    } else {
      nMinor = n3;
      nMid = n2;
    }
  } else if (n2 >= n3) {
    nMajor = n2;
    if (n1 <= n3) {
      nMinor = n1;
      nMid = n3;
    } else {
      nMinor = n3;
      nMid = n1;
    }
  } else {
    nMajor = n3;
    
    if (n1 <= n2) {
      nMinor = n1;
      nMid = n2;
    } else {
      nMinor = n2;
      nMid = n1;
    }
  }

  System.out.println("Major number: " + nMajor);
  System.out.println("Mid number:   " + nMid);
  System.out.println("Minor number: " + nMinor);

  s.close();
 } 
}
