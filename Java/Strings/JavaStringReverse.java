package String;
import java.util.*;

public class JavaStringReverse {

	public static void main(String[] args) {
		 
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean can = true;
        for(int i = 0 ; i < A.length();i++){
        	if(A.charAt(i)!=A.charAt(A.length()-1-i)){
        		can = false;
        		break;
        	} 
        }
        System.out.printf("%s\n",(can) ? "Yes" : "No");
	}

}
