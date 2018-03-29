package Introduccion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int ntc = 1;
		while(in.ready()) {
			System.out.printf("%d %s\n",ntc++,in.readLine());
		}
	}

}
