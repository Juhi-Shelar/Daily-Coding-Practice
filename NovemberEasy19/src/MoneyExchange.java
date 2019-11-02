import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;


public class MoneyExchange {
	/*
	public static boolean isPossible(Vector<Long> a, long p, Set<Long> cost) {
		boolean res = true;
		
		while(p>0) {
			if(cost.contains(p))
				return true;
			else {

				for (long s : cost) {
					if(s>p) {
						p = p-s;
						continue;
					}
				}
			}
		}
		
		return res;
	}
	*/
	
	public static void main(String[] args) {
		long n, q;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		q = sc.nextLong();
		
		//Set<Long> a = new LinkedHashSet<Long>();
		long a[] = new long[(int) n];
		Vector<Long> cost = new Vector<Long>();
		
		
		for(int i=0; i<n; i++) {
			long temp = sc.nextLong();
			//a.add(temp);
			a[i]=temp;
		}
		
		for(int i=0; i<q; i++) {
			long temp = sc.nextLong();
			cost.add(temp);
		}
		
		//compute
		for(int i=0; i<q; i++) {
			boolean state = true;
			int flag = 0;
			for(int j=0; j<n; j++) {
				if(cost.get(i)% a[j] == 0) {
					System.out.println("YES");
					state = false;
					break;
				}
			}
			if(state==false)
				continue;
			
			for(int k=0; k<n; k++) {			//scan all notes
				while(cost.get(i)>=a[k]) {		//get next greater element
					k++;
					continue;
				}				
				
				for(int p=k;p>=0;p--) {
					long temp = a[k] - cost.get(i);
					
					for(int q1=0;q1<p;q1++) {
						if(temp==a[q1]) {
							System.out.println("YES");
							flag=2;
						}
					}
					if(flag==2)
						break;
					if(flag!=0) {
						k++;
						continue;
					}
				}
				
			}

			if(flag==0)
				System.out.println("NO");
		}
		
		
		sc.close();
	}
	
}
