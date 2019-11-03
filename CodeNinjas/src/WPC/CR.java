//Who will be the CR Solution

package WPC;

import java.util.Scanner;

public class CR {
	public static void main(String[] args) {
		String s=new String();
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=0;
		arr[2]=0;
		int temp;
		
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i)=='A')
			{
				temp=arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
			}
			if(s.charAt(i)=='B')
			{
				temp=arr[1];
				arr[1]=arr[2];
				arr[2]=temp;
			}
			if(s.charAt(i)=='A')
			{
				temp=arr[0];
				arr[0]=arr[2];
				arr[2]=temp;
			}
			i++;
		}
		
		for(int j=0;j<3;j++)
		{
			if(arr[j]==1)
			{
				System.out.println(j+1);
				break;
			}
		}
	}	
}
