package Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			if(map.containsKey(temp))
				map.put(temp, map.get(temp)+1);
			else
				map.put(temp, 1);
		}
		
		int maxValueInMap = (Collections.max(map.values())); 
		 
        for (Entry<Integer, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());    
                break;
            }
        }
	
		sc.close();
	}
}
