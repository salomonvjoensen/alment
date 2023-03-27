public class Start {
   public static void main(String[] args) {
      if (args == null) {
         System.out.println("You didn't type any argument.");
      }
      if (args.length != 0) {
         int i = 0;
         while (i < args.length) {
            System.out.printf("You typed: %s%n", args[i]);
            i++;
         }
      }
   }

}