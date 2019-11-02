// https://codingninjas.in/events/world-programming-championship

package PracticeTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GaitondeCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aa[] = new int[10];
		Set<Integer> a = new HashSet<Integer>();
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			int temp = sc.nextInt();
			aa[i]=temp;
			a.add(temp);
			sum += temp;
		}
		
		sum = sum-100;
		int d1=0,d2=0;
		
		for(int i=0; i<9; i++) {
			int diff = sum - aa[i];
			if(a.contains(diff)) {
				d1=aa[i];
				d2=diff;
				break;
			}
		}
		
		for(int i=0;i<9;i++) {
			if(aa[i]==d1 || aa[i]==d2)
				continue;
			System.out.println(aa[i]);
		}
				
		sc.close();
	}

}
