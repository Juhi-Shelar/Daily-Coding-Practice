import java.util.Scanner;

public class CompressList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int a[][] = new int[t][1000];
		int n[] = new int[t];
		
		for(int i=0;i<t;i++) {
			n[i] = sc.nextInt();
			for(int j=0;j<n[i];j++)
				a[i][j] = sc.nextInt();
		}
		
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<n[i];j++) {
				
				
				int arr[] = a[i];
				int k = j;
				
				if(j!=0)
					System.out.print(",");
					
				System.out.print(arr[j]);
				
				while(k<(n[i]-1) && arr[k+1]-arr[k]==1) 
					k++;
				
				if(arr[k]-arr[j]>1)
					System.out.print("..."+arr[k]);
				else if(arr[k]-arr[j]==1)
					System.out.print(","+arr[k]);
				j=k;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
