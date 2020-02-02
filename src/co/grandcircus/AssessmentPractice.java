package co.grandcircus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class 

AssessmentPractice {

	public static boolean takeItAway(Map<String, String> map, String key) {
		boolean containedKey = map.containsKey(key);
		map.remove(key);
		
		return containedKey;		
	}

	public static int fleeZero(int[] nums) {
		int i = 0;
		
		
		return i;
	}

	public static Integer howFarApart(List<String> words, String string, String string2) {
		int i = 0;
		int j = words.indexOf(string);
		int k = words.indexOf(string2);
		
		try {
			if (j > k) {
				i = j - k;
			} else if (k > j) {
				i = k - j;
			}
		} catch (IllegalArgumentException e) {throw e;}
		
		return i;
	}

	public static int lift(List<String> words) {
				
		for (int i = 0; i < words.size(); i++) {
			words.add(words.get(i).toUpperCase());
			words.remove(i);
		}
		
		System.out.println(words);
		return words.size();	
	}

	public static Set<String> listToSet(List<String> list) {
		
		Set<String> newList = new TreeSet<>();
		
		for (int i = 0; i < list.size(); i++) {
			
			newList.add(list.get(i));
		}
		
		return newList;
	}

	public static double makeADifference(double[] nums, int i, int j) {
		int len = nums.length;
		double i1 = 0.0; 
		try {
			if ((i >= 0 && i<len) && (j >= 0 && j<len)) {
				i1 = nums[i] - nums[j];
			}
			
		}catch (Exception e){
			throw e;
			}		
		
		System.out.println(i1);
		return i1;
	}

	public static Set<Integer> neverTellMeTheOdds(int[] nums) {
		
        Set<Integer> set = new HashSet<Integer>();	
        
        for(int i = 0; i < nums.length; i++) {
        	if (nums[i] % 2 == 0) {
        		set.add(nums[i]);
        	}
        }
		
		return set;
	}

	public static Map<Integer, String> espanol() {

		Map<Integer, String> word = new HashMap<>();
		
		word.put(1, "Uno");
		word.put(2, "Dos");
		word.put(3, "Tres");
				
		return word;
	}

}
