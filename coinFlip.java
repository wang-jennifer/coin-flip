import java.util.*;

public class CoinFlip {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Number of flips? ");
      int numFlips = console.nextInt();
      System.out.println("Flipping coin " + numFlips + " times...");
      System.out.println();
      
      int current = 0;
      int heads = 0;
      int tails = 0;
      Random r = new Random();
      while (current < numFlips) {
         int chance = r.nextInt(2); // either 0 or 1
         if (chance == 0) {
            System.out.println("heads");
            heads++;
         } else {
            System.out.println("tails");
            tails++;
         }
         current++;
      }
      
      if (numFlips > 0) {
         System.out.println();
      }
      
      System.out.println("Out of " + numFlips + " flips, there were: ");
      System.out.println(heads + " heads, " + tails + " tails");
   }
}
