package String;

import java.util.Scanner;

public class JavaStringsIntroduction {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length()+B.length());
	        System.out.printf("%s\n", (A.compareTo(B)>0) ? "Yes" : "No");
	        String tmpA = A.substring(0, 1).toUpperCase() + A.substring(1) , tmpB = B.substring(0, 1).toUpperCase() + B.substring(1);
	        System.out.printf("%s %s\n",tmpA,tmpB);
	  
	    }

}
