// https://www.codechef.com/COOK112B/problems/DIET
import java.util.Scanner;

public class ChefDiet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t,j;
		t = sc.nextInt();
		
		int n[] = new int[t];
		int k[] = new int[t];
		
		int a[][] = new int[t][100];
		
		for(int i=0;i<t;i++) {
			n[i] = sc.nextInt();
			k[i] = sc.nextInt();
			
			for(j=0;j<n[i];j++)
				a[i][j]=sc.nextInt();
		}
		
		
		for(int i=0;i<t;i++) {
			int proteinCount = 0;
			
			for(j=0;j<n[i];j++) {
				proteinCount+=a[i][j];
				if(proteinCount<k[i]) {
					System.out.println("NO "+(j+1));
					break;
				}
				else {
					proteinCount-=k[i];
				}
			}
			
			if(j==n[i])
				System.out.println("YES");
		}
		sc.close();
	}
}
