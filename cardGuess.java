import java.util.*;
import java.lang.*;
public class cardGuess{
   public static void main(String[] args)
   {
     /* Scanner scan = new Scanner(System.in);
      System.out.println("How many times do you want to run your code? " );
      int runs = scan.nextInt();
      int numberOfSuccesses = 0;
      for(int o = 0; o<runs; o++)
      {
         System.out.println("How many people are in the expirement? ");
         int peeps = scan.nextInt();
         ArrayList<Integer> people = new ArrayList<Integer>();
         Set<Integer> guessed = new TreeSet<Integer>();
         for(int i = 0; i<peeps; i++)
         {
            people.add(i);
         }
         Collections.shuffle(people);
         Random rn = new Random();
         boolean found = false;
         int guessNum = 0;
         boolean weFoundIt =true; 
         int guessTotal = peeps/2;
         for(int i = 0; i<people.size();i++)
         {
            found = false;
            guessNum=0;
            guessed.clear();
            while(found==false && guessNum < guessTotal)
            {
               
               int guess = rn.nextInt(peeps);
               System.out.println("Person " + i + " looks in block " + people.get(guess));
               if(guessed.add(guess) && people.get(guess)==i)
               {
                  found = true;
                  System.out.println("Person " + i + " found it");
               }
               else if(people.get(guess) != i)
               {
                  System.out.println("Wrong Guess");
               }
               else if(guessed.add(guess) != true)
               {
                  guess = rn.nextInt(peeps+1);
                  guessNum--;
                  System.out.println("Look here");
               }
               guessNum++;
            }
            if(guessNum == peeps/2 && found == false)
            {
               weFoundIt = false;
            }
            
         }
         if(weFoundIt == true)
         {
            System.out.println("Hell yeah");
            numberOfSuccesses++;
         }
         else
         {
            System.out.println("Bruh");
         }
      }
      double total = (double) numberOfSuccesses/runs;
      System.out.println( numberOfSuccesses + " " + runs);
      System.out.println((total*100) + "%");
      */
      byte b = 3;
      System.out.print(b);
   }
}