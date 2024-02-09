import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean yahOrNay;

	public Graph(String line)
	{
      String[] x = line.split(" ");
      map=new TreeMap<String,String>();
      for(int i = 0; i<x.length;i++)
      {
         if(!map.containsKey(x[i].substring(0,1)))
         {
            map.put(x[i].substring(0,1),x[i].substring(1));
         }
         else{
            map.put(x[i].substring(0,1), map.get(x[i].substring(0,1))+x[i].substring(1));
         }
         if(!map.containsKey(x[i].substring(1)))
         {
            map.put(x[i].substring(1),x[i].substring(0,1));
         }
         else{
            map.put(x[i].substring(1), map.get(x[i].substring(1))+x[i].substring(0,1));
         }
      }
	}

	public boolean contains(String letter)
	{
	   if(map.containsKey(letter))
      {
         return true;
      }
      return false;
	}

	public void check(String first, String second, String placesUsed)
	{
      if(map.get(first).contains(second))
      {
         //System.out.println(map.get(first));
         System.out.println("Whoever wrote this code is so handsome");
      }
      else
      {
         String connections = map.get(first);
         for(int i =0; i<connections.length();i++)
         {
            if(!placesUsed.contains(connections.substring(i,i+1)))
            {
               placesUsed+=connections.substring(i,i+1);
               check(connections.substring(i,i+1),second,placesUsed);
            }
         }
      }
	}

	public String toString()
	{
		return map.toString();
	}
}