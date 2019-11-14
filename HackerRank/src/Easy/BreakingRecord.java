package Easy;

import java.util.Scanner;

public class BreakingRecord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t;
		t = sc.nextInt();
		
		long a[] = new long[t];
		for(int i=0;i<t;i++)
			a[i] = sc.nextLong();
		
		long min = a[0];
		long max = a[0];
		
		int min_cnt = 0;
		int max_cnt = 0;
		
		for(int i=1;i<t;i++) {
			if(a[i]<min) {
				min = a[i];
				min_cnt++;
			}
			if(a[i]>max) {
				max = a[i];
				max_cnt++;
			}				
		}
			
		System.out.println(max_cnt+" "+min_cnt);
		
		sc.close();
	}
}
