import java.util.*;
import java.io.*;

class Primero{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(),a=0,b=0,n=0;
        for(int ntc=0;ntc<t;ntc++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int suma;
            for(int i = 0 ; i< n ; i++){
                suma = a;
                for(int j = 0 ; j< i+1 ; j++){
                    suma+=(b*Math.pow(2,j));
                }
                System.out.printf("%d%c",suma,(i+1<n) ? ' ': '\n');           
        }        
        in.close();
    }
}
