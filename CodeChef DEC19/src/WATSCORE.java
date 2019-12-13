import java.util.Scanner;

public class WATSCORE {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t;
		t = sc.nextInt();
		
		int res[] = new int[t];
		
		int n;
		
		for(int i=0;i<t;i++) {
			n = sc.nextInt();
			
			int arr[] = new int[8];
			
			for(int j=0;j<n;j++) {
				int p,s;
				p = sc.nextInt();
				s = sc.nextInt();
				
				if(p<9)
					if(arr[p-1]<s)
						arr[p-1]=s;
			}
			
			for(int k=0;k<8;k++) 
				res[i]+=arr[k];			
			
		}
		
		for(int i=0;i<t;i++)
			System.out.println(res[i]);
		
		sc.close();
	}

}
