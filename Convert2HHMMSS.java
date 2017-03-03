/*
Jesus Antonio Carranza
CMPS 205
Convert2HHMMSS
Homework pg.109 # 11
*/

 import java.util.*;
 public class Convert2HHMMSS
 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		int secondsIn;
		int hours;
		int remainder1;
		int minutes;
		int secondsOut;
		String str;
		
		System.out.println();
		
		//to input seconds
		System.out.println("Enter number of sceonds: " );
		secondsIn = console.nextInt();
		System.out.println();
		
		
		//to get hours
		hours = secondsIn / 3600;
		
		remainder1 = secondsIn % 3600;
		
		//to get min.
		minutes = remainder1 / 60;
		
		//to get sec.
		secondsOut = remainder1 % 60;
		
		//to apear in hr:min:sec format
		str = hours + ":" + minutes + ":" + secondsOut;
		System.out.println("The hours, minutes, and seconds are: " + str);
		
		
	}
 }
 