// https://www.codechef.com/NOV19B/problems/LSTBTF

import java.util.Scanner;

public class SmallBeautiNum {
	
	
	static boolean isPerfectSquare(int x) 
	{    
		double sr = Math.sqrt(x); 
	     
		return ((sr - Math.floor(sr)) == 0); 
	} 
	
	public static int getRes(int n) {
		int largest = 1;
		int smallest = 1;
		 
		for(int i=0;i<n;i++) 
			largest = largest*10;
		
		smallest = largest/10;
		largest--;
		
		for(int i=smallest; i<largest; i++) {
			if (String.valueOf(i).contains("0"))
				continue;
			
			 int q,r,t=0;
			 q=i;
			 do
			 {
			      r=q%10;
			      t += r*r;
			      q=q/10;
			 }
			 while(q!=0);
			 
			 if(isPerfectSquare(t)) {
				 return i;	 
			 }
			 
		}
			
		
		return -1;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int a[] = new int[t];
		for(int i=0; i<t; i++)
			a[i] = sc.nextInt();
		
		
		for(int i=0; i<t; i++) {
			System.out.println(getRes(a[i]));	
		}
		sc.close();
	}
}
