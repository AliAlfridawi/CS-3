import java.util.*;
public class coinMakerHovey
{
   public static void main(String[] args)
   {
      String[] coins = {"Penny","Nickal","Dime","Quater"};
      int[] acceptableCurrency = {1,5,10,23,25};
      System.out.println("Acceptable coins " + Arrays.toString(coins)); 
      Scanner scan = new Scanner(System.in);
      System.out.print("How much change do you need? ");
      int change = scan.nextInt();
      System.out.println(change);
      int[] returned = new int[change+1];
      Arrays.fill(returned,-1);
      returned[0]=0;
      int cur=0;
      int[] smallest=new int[acceptableCurrency.length];
      for(int i = 1; i<returned.length;i++)
      {
         smallest=new int[acceptableCurrency.length];
         for(int j = 0; j<acceptableCurrency.length;j++)
         {
            cur = 0;
            if(i-acceptableCurrency[j]>=0)
            {
               cur = i-acceptableCurrency[j];
               //System.out.println(cur);
               smallest[j]=1+returned[cur];
            }
         }
         for(int f = 0; f<smallest.length;f++)
         {
            if(returned[i]==-1)
            {
               returned[i]=smallest[f];
            }
            else if(returned[i]>smallest[f] && smallest[f]!=0)
            {
               returned[i]=smallest[f];
            }
         }
        
      }
      System.out.println(Arrays.toString(returned));
      System.out.print(returned[change]);
  }
}