package String;
import java.util.*;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> subString = new ArrayList<String>();
        for(int i  = 0 ; i< s.length()-k+1;i++){
        	subString.add(s.substring(i,i+k));
        }
        Collections.sort(subString);
        
        smallest = subString.get(0);
        largest = subString.get(subString.size()-1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

