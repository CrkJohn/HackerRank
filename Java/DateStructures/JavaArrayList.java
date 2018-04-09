import java.io.*;
import java.util.*;

public class JavaArrayList {

	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		ArrayList<ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>();

		int n = Integer.parseInt(br.readLine().trim());
		for(int i = 0 ; i< n ; i++){
			matriz.add(new ArrayList<Integer>());
			stk = new StringTokenizer(br.readLine());
			stk.nextToken();
			while(stk.hasMoreTokens()) {
				matriz.get(i).add(Integer.parseInt(stk.nextToken()));
			}	
		}
		int q = Integer.parseInt(br.readLine().trim()),x,y;
		for(int i = 0; i< q ; i++) {
			stk = new StringTokenizer(br.readLine().trim());
			x = Integer.parseInt(stk.nextToken());
			y = Integer.parseInt(stk.nextToken());
			try {
				System.out.printf("%d\n",matriz.get(x-1).get(y-1));
			}catch(Exception e){
				System.out.println("ERROR!");
			}
		}
	}

}
