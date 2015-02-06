

import java.io.*;
import java.util.Scanner;


public class FrequencyList {
	public static void main(String args[]) {
		int[] frequency = new int[26];
		char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 
						'H', 'I', 'J', 'K', 'L', 'M', 'N', 
						'O', 'P', 'Q', 'R', 'S', 'T', 'U', 
						'V', 'W', 'X', 'Y', 'Z'};
		Scanner s;
		try {
			s = new Scanner(new File("words.txt"));
			while (s.hasNextLine()){  
				String word = s.next();
				for (int i = 0; i< word.length() ;i++){
					//System.out.println(word.charAt(i));
					frequency[(int)((char)word.charAt(i)-'A')]++;
				}
				s.nextLine();
			}
			int total = 0;
			for (int i = 0; i < 26; i++){
				System.out.println(""+letter[i]+ ": " +frequency[i]);
				total +=frequency[i];
			}
			System.out.println("Total: " + total);
			for (int i = 0; i < 26; i++){
				System.out.println(frequency[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	         

}
