import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sum2d {
	public static void main(String[] args)throws Exception {
		int n, arr[], i = 0, c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine().trim());
		arr = new int[n];
		StringTokenizer stk;
		stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens()) {
			arr[i++] = Integer.parseInt(stk.nextToken()); 
		}
		int sumParcial;
		for(i = 0 ; i<n;i++) {
			sumParcial = arr[i];
			if(arr[i]<0)c++;
			for(int j = i+1 ; j < n; j++){
				sumParcial+=arr[j];
				if(sumParcial<0)c++;
			}
			
		}
		System.out.printf("%d\n",c);	
	}
}
	


