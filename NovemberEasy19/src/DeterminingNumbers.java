
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.*;


public class DeterminingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
				
		for(long i=0; i<n; i++) {
			long temp = sc.nextLong(); 
			if(map.containsKey(temp))
				map.put(temp, map.get(temp)+1);
			else
				map.put(temp, 1);
		}
		
		for (Entry<Long, Integer> entry : map.entrySet()) {
	            if (entry.getValue().equals(1)) {
	                System.out.print(entry.getKey()+" ");
	            }
	    }
		 
		 sc.close();
	}

}
