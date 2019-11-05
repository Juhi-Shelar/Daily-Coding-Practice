import java.util.Arrays;
import java.util.Scanner;

public class ClosingTweets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		
		//sc.useDelimiter("\n"); // use LF as the delimiter
       sc.nextLine();
		
		String clicks[] = new String[k];
		
		for(int i=0;i<k;i++) {
			clicks[i]=sc.nextLine();
		//	System.out.println(clicks[i]+'j');
		}
		
		boolean state[] = new boolean[k];
		
		int cnt = 0;
				
		for(int i=0;i<k;i++) {
			if(clicks[i].equals("CLOSEALL")) {
				cnt = 0;
				Arrays.fill(state, false);
			}
			else {
			   // System.out.println(clicks[i].length()+""+clicks[i]);
				int num = Integer.parseInt(clicks[i].substring(6,clicks[i].length()));
						
				if(state[num-1]==true) {
					state[num-1] = false;
					cnt--;
				}
				else {
					state[num-1]=true;
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
