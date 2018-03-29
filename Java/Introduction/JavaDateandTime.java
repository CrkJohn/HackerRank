package Introduccion;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class JavaDateandTime {
	
	public static String getDay(String day, String month, String year) {
		String dia;
		LocalDate ld  = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
		return ld.getDayOfWeek().toString();
       }

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	      String month = in.next();
	      String day = in.next();
	      String year = in.next();
	        
	      System.out.println(getDay(day, month, year));

	}

}
