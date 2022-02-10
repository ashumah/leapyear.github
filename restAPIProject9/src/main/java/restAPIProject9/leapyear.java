package restAPIProject9;


	import java.util.Scanner;

	public class leapyear {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the year");
			int year = input.nextInt();
			boolean is_leap_year =(year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
			System.out.println(year + "is a leap year?"+is_leap_year);
			
			

		}

	}
	 
