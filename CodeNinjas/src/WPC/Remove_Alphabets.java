package WPC;

import java.util.Scanner;

public class Remove_Alphabets {
	public static void main(String[] args) {
		String s=new String();
		
		Scanner sc=new Scanner(System.in);
		s=sc.next();

		String s1 = s.replaceAll("[CAMBRIDGE]", "");		
		System.out.println(s1);
		
		sc.close();
	}
}
