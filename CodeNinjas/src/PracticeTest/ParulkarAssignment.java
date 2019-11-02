	package PracticeTest;
	
	import java.util.Scanner;
	
	public class ParulkarAssignment {
		public static int issub(String q, String a) {
			
			int maxlen = 0;
			if(a.length()<q.length()) {
				
				maxlen=a.length();
								
			}
			else {
				maxlen=q.length();
			}
			
			boolean s=true;
			for(int i=0;i<maxlen;i++) {
				if(q.charAt(i)!=a.charAt(i))
					s=false;
			}
			
			if(s==true)
				return q.length()+1;
			
			else
				return 0;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			String str[] = new String[n];
			for(int i=0;i<n;i++) {
				str[i]=sc.next();
			}
			
			int q = sc.nextInt();
			
			String query[] = new String[n];
			for(int i=0;i<q;i++) {
				query[i]=sc.next();
			}
			
			int k;
			
			for(int i=0;i<q;i++) {
				int res=0;
				String qq=query[i];
			
				for(int j=0;j<n;j++) {
					if(str[j].equals(qq)){
						res=res+str[j].length()+1;
						break;
					}
					
					if(issub(query[i], str[i])>0) {
						res=res+issub(query[i], str[i]);
						break;
					}
						
					
					String temp=str[j];
				
					int maxlen = 0;
					if(temp.length()<qq.length()) {
						
						maxlen=temp.length();
										
					}
					else {
						maxlen=qq.length();
						
					}
					
					
					for( k=0;k<maxlen;k++) {	
						if(! (temp.charAt(k)==qq.charAt(k)) ) {
							res++;
							break;
						}
						else 
							res++;		
					}
					
					
					
				}
				System.out.println(res);
			}
			
			
			
		}
	}
