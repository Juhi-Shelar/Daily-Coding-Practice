import java.util.Scanner;

public class GokiBreakup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int maxSkill = sc.nextInt();
		
		int a[] = new int[t];
		for(int i=0;i<t;i++)
			a[i] = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			if(a[i]>=maxSkill)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
