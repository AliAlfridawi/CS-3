import java.util.*;
import java.io.*;
public class spanishToEnglish {
   public static void main(String[] args) throws IOException
   {
      File myObj = new File("spanishData.txt");
      Scanner scan = new Scanner(myObj);
      Map<String,String> spanToEng = new HashMap<String,String>();
      int fu = scan.nextInt();
      int count=0;
      for(int i = 0; i<fu;i++)
      {
         String[] line = scan.nextLine().split(" ");
         if(line.length>1)
         {
         spanToEng.put(line[0],line[1]);
         }
      }
      System.out.println("==== MAP CONTENTS ====");
      System.out.println(spanToEng.entrySet());
      System.out.println("==== READ LINES ====");
      scan.nextLine();
      while(scan.hasNextLine())
      {
         String[] line = scan.nextLine().split(" ");
         for(int i = 0; i<line.length; i++)
         {
            System.out.print(spanToEng.get(line[i]) + " ");
         }
         System.out.println();
      }
   }
}