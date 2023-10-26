package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest{
	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> number=new TreeSet<Integer>();
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			number.add(num[i]);
		}
		List<Integer> numlist=new ArrayList<Integer>(number);
		if(numlist.size()>=2) {
			int sec=numlist.get(numlist.size()-2);
			System.out.println("Sec:" +sec);
		}
		else {
			System.out.println("No second largest element");
	}
	
}
}





