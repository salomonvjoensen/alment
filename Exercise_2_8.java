import java.util.Scanner;

public class Exercise_2_8 {
   public static void main(String[] args) {
      /**
       * The program performs a sample payroll calculation
       * with multiplication.
       */
      try(Scanner keyboardInput = new Scanner(System.in)) {
         System.out.print("Enter first number: ");
         int b = keyboardInput.nextInt();

         System.out.print("Enter second number: ");
         int c = keyboardInput.nextInt();

         int a = b * c;

         System.out.printf("Their product is: %s%n", a);
      }
   }
}