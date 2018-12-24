package Homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Home1 {

	public static void main(String[] args) {
		Set set1 = new TreeSet();
		Set set2 = new TreeSet();
		
		for(int i = 0; i < 10;i++) {
			set1.add(i);
			set2.add(i+5);
			
			
		}
		System.out.println(" Set 1 is  "+set1);
		System.out.println(" Set 2 is  "+set2);
		
		//System.out.println(" Union "+Union(set1, set2)+set1);
		System.out.println(" Intersect "+Intersect(set1, set2)+set1 );
	}
	public static boolean Union(Set set1, Set set2) {
		return set1.addAll(set2);
	}
	
	public static boolean Intersect(Set set1, Set set2) {
	return set1.retainAll(set2);/* Перетин */
	}

}
