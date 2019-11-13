// https://www.hackerrank.com/challenges/kangaroo/problem

package Easy;

import java.util.Scanner;

public class Kangaroo {
	
	public static boolean isPossible(int x1, int x2, int v1, int v2) {
		if(x1<x2 && v1<v2)
			return false;
		
		while(true) {
			if(x1>1000 || x2>1000)
				return false;
			if(x1==x2)
				return true;
			x1+=v1;
			x2+=v2;
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2,v1,v2;
		
		x1 = sc.nextInt();
		v1 = sc.nextInt();
		x2 = sc.nextInt();
		v2 = sc.nextInt();
		
		if(isPossible(x1, x2, v1, v2)==true)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		sc.close();
	}

}
