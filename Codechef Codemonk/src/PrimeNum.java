import java.util.Scanner;

// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/

public class PrimeNum {
	static boolean checkPrime(int n) {
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2; i<=n ;i++) 
			if(checkPrime(i))
				System.out.print(i+" ");
				
	}
}
