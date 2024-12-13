package sebi.previous.y2021;

import java.util.*;
import java.time.*;

public class DayOfWeekFromGivenDate {
	
	public static String getDayOfWeek(String date) {
		
		String[] arr = date.split("/");
		int year = Integer.parseInt(arr[2]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[0]);
		
		
		LocalDate localDate = LocalDate.of(year, month, day);
		
		return localDate.getDayOfWeek().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		System.out.println(getDayOfWeek(date));
	}

}
