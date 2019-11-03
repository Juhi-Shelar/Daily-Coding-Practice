package WPC;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Explosion {
	public static void main(String[] args) throws ParseException {
		Scanner sc  = new Scanner(System.in);
		String curr = sc.next();
		String desired = sc.next();
		
		String night = "24:00:00";

		DateFormat sdf=new SimpleDateFormat("hh:mm:ss");
		Date t1=sdf.parse(curr);
		Date t2=sdf.parse(desired);
		
		Date t3 = sdf.parse(night);
		
		if (t1.compareTo(t2) > 0) {

			 long diff = t3.getTime() - t1.getTime();

	         long diffSeconds = diff / 1000 % 60;
	         long diffMinutes = diff / (60 * 1000) % 60;
	         long diffHours = diff / (60 * 60 * 1000);
	         
	         String des[] = desired.split(":");
	         
	         diffSeconds +=  Integer.parseInt(des[2]);
	         
	         diffMinutes +=  Integer.parseInt(des[1]);
	         diffHours +=  Integer.parseInt(des[0]);
	         
	         System.out.print(String.format("%02d", diffHours) + ":");
	         System.out.print(String.format("%02d", diffMinutes) + ":");
	         System.out.print(String.format("%02d", diffSeconds));
			
		}
		else {
			 long diff = t2.getTime() - t1.getTime();
			 

	         long diffSeconds = diff / 1000 % 60;
	         long diffMinutes = diff / (60 * 1000) % 60;
	         long diffHours = diff / (60 * 60 * 1000);
	         
	         if(diffHours>12)
	        	 diffHours=diffHours-12;
	         
	         System.out.print(String.format("%02d", diffHours) + ":");
	         System.out.print(String.format("%02d", diffMinutes) + ":");
	         System.out.print(String.format("%02d", diffSeconds));
						
		}

	}

}
