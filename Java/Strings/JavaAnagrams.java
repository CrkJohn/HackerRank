package String;

import java.io.*;
import java.util.*;

public class JavaAnagrams {
   	static boolean isAnagram(String a, String b) {
       // Complete the function
   		a = a.toLowerCase();
   		b = b.toLowerCase();
   		char arrA[] = a.toCharArray();
   		char arrB[] = b.toCharArray();
   		boolean ret  = true;
   		if(a.length()<b.length() || b.length()<a.length()) {
   			ret = false;
   		}else{
   			Arrays.sort(arrA);
   			Arrays.sort(arrB);
   			for(int i = 0; i < a.length() ; i++) {
   				if(arrA[i] != arrB[i]) {
   					ret = false;
   					break;
   				}
   			}
   			
   		}
   		return ret;
   	}
		
   	public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
