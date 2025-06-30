package javahowtos;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Type a number: ");
      int x = scanner.nextInt();

      System.out.print("Type another number: ");
      int y = scanner.nextInt();

      int sum = x + y;
      System.out.println("Sum is: " +  sum);

      scanner.close();
    }
}
