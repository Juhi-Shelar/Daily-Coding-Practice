package WPC;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;


class Solutions {
   
	static HashMap<Character, String> map = new HashMap<Character, String>();
    
	public static void zig_zag(List<String> words, char[] queries) {
		for(int i=0;i<words.size();i++) 
			map.put(words.get(i).charAt(0), words.get(i));

		for(int i=0;i<queries.length;i++)
			System.out.println(map.get(queries[i]));
		
	}
    
    
}


public class Word_Game {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(s.next());
		}


		s.nextLine();

		String str = s.nextLine();
		
		String[] arr = str.split(" ");
		char[] queries = new char[arr.length];
				
		for(int i = 0; i < arr.length; i++) {
			queries[i] = arr[i].charAt(0);
		}

		Solutions.zig_zag(list, queries);	
	}
}
