// https://www.hackerrank.com/challenges/apple-and-orange/problem

package Easy;

import java.util.Scanner;

public class AppleOrange {
	public static void main(String[] args) {
		int s,t,m,n,a,b;
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextInt();
		t = sc.nextInt();
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		int d1[] = new int[m];
		int d2[] = new int[n];
		
		for(int i=0;i<m;i++)
			d1[i] = sc.nextInt();
		
		for(int i=0;i<n;i++)
			d2[i] = sc.nextInt();
		
		int cnt = 0;
		for(int i=0;i<m;i++)
			if(a+d1[i]>=s && a+d1[i]<=t)
				cnt++;
				
		System.out.println(cnt);
		
		cnt = 0;
		
		for(int i=0;i<n;i++)
			if(b+d2[i]>=s && b+d2[i]<=t)
				cnt++;
		
		System.out.println(cnt);
		
		sc.close();
	}
}
