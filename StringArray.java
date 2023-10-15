package week5.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArray {
	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		String[] company={"HCL","Wipro","Aspire Systems","CTS"};
		for (String string : company) {
			name.add(string);
			System.out.println(string);	
         System.out.println(name.size());
         Collections.sort(name);
         System.out.println(name);
         Collections.reverse(name);
         System.out.println(name);
 
		}
	}
}

