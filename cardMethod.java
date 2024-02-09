import java.util.*;
import java.lang.*;
public class cardMethod
{
   public static void main(String[] args)
   {
     Scanner scan = new Scanner(System.in);
     System.out.println("How many times do you want to run in your code? " );
     int runs = scan.nextInt();
     int numberOfSuccesses = 0;
     System.out.println("How many people do you want to run in your code? ");
     int peeps = scan.nextInt();
     int numOfSuccess = 0;
     for(int oh = 0; oh<runs; oh++)
     {
         ArrayList<Integer> boxes = new ArrayList<Integer>();
         for(int i = 0; i<peeps;i++)
         {
            boxes.add(i);
         }
         Collections.shuffle(boxes);
         int guessNum = peeps/2;
         int currentGuessNum = 0;
         int currentGuess = 0;
         boolean found = false;
         boolean weGetItRight = true;
         for(int i = 0; i<boxes.size();i++)
         {
            currentGuess=i;
            currentGuessNum=0;
            found = false;
            while(found==false && currentGuessNum<guessNum)
            {
               if(boxes.get(currentGuess)==i)
               {
                  found=true;
               }
               else if(boxes.get(currentGuess)!=i)
               {
                  currentGuess = boxes.get(currentGuess);
               }
               currentGuessNum++;
            }
            if(found == false)
            {
               weGetItRight = false;
            }
         }
         if(weGetItRight)
         {
            numberOfSuccesses++;
            System.out.println("hell yeah");
         }
         else
         {
            System.out.println("hell no");
         }
     }
     double total = (double) numberOfSuccesses/runs;
     System.out.println( numberOfSuccesses + " " + runs);
     System.out.println((total*100) + "%");
   }
}