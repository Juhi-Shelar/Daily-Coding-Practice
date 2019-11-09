// https://www.codechef.com/NOV19B/problems/HRDSEQ

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HardSeq {
	static int a[] = new int[128];
	
	public static void generate() {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		a[0]=0;
		
		for(int i=1;i<128;i++) {
			if(map.containsKey(a[i-1]) && map.get(a[i-1]) == 1) {
					a[i]=0;
					map.put(0, map.get(0)+1 );	
			}
			else {
				int temp = a[i-1];
				int j = i-2;
				while(j>0 && a[j]!=temp)
					j--;
				a[i]=(i-1)-j;
				if(map.containsKey(a[i]))
					map.put(a[i], map.get(a[i])+1 );
				else
					map.put(a[i], 1);
			}
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		generate();
		
		int t = sc.nextInt();
		
		int n[] = new int[t];
		
		for(int i=0;i<t;i++)
			n[i] = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=0; i<t; i++) {
			cnt = 0;
			for(int j =0; j<n[i]; j++)
				if(a[j]==a[n[i]-1])
					cnt++;
			
			System.out.println(cnt);
		}
		sc.close();
		
	}
}
