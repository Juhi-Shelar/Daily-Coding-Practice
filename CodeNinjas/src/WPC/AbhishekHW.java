package WPC;

import java.util.Scanner;

public class AbhishekHW {
	
    static int countSC(double N) 
    { 
        int res = (int)Math.sqrt(N) +  
                  (int)Math.cbrt(N) -  
                  (int)(Math.sqrt(Math.cbrt(N))); 
      
        return res; 
    } 
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	
    	double a[] = new double[t];
    	for(int i=0;i<t;i++)
    		a[i]=sc.nextDouble();
    
    	for(int i=0;i<t;i++)
    		System.out.println(countSC(a[i]));
    	sc.close();
	}
}
