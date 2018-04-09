import java.io.*;
import java.util.*;

public class JavaMap {

	  public static void main(String []argh) throws Exception
	   {
	      Scanner in = new Scanner(System.in);
	      Hashtable<String, Integer> dic = new Hashtable<String, Integer>();
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         dic.put(name,phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if (dic.containsKey(s)){
	             System.out.println(s+"="+dic.get(s));
	         }else{
	             System.out.println("Not found");
	         }
	      }
	      
	   }

}
