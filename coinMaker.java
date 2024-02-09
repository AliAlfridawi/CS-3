import java.util.*;
public class coinMaker
{
   public static void main(String[] args)
   {
      String[] coins = {"Penny","Nickal","Dime","Quater"};
      Map<String,Integer> num = new HashMap<String,Integer>();
      System.out.println("Acceptable coins " + Arrays.toString(coins)); 
      Scanner scan = new Scanner(System.in);
      System.out.print("How much change do you need? ");
      double change = scan.nextInt();
      System.out.println(change);
      while(change>0)
      {
         if(change>=25)
         {
            change = change-25;
            if(!num.containsKey("quarter"))
            {
               num.put("quarter",1);
            }
            else
            {
               num.put("quarter",num.get("quarter")+1);
            }
            
         }
         else if(change>=10)
         {
            change = change-10;
            if(!num.containsKey("dime"))
            {
               num.put("dime",1);
            }
            else
            {
               num.put("dime",num.get("dime")+1);
            }
            
         }
         else if(change>=5)
         {
            change = change-5;
            if(!num.containsKey("nickal"))
            {
               num.put("nickal",1);
            }
            else
            {
               num.put("nickal",num.get("nickal")+1);
            }
            
         }
         else if(change>=1)
         {
            change = change-1;
            if(!num.containsKey("penny"))
            {
               num.put("penny",1);
            }
            else
            {
               num.put("penny",num.get("penny")+1);
            }
            
         }
      }
      Set x = num.entrySet();
      System.out.println(x);
   }
}