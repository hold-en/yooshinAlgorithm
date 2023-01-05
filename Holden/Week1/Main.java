package blackRabbit.week1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] test1 = {"cba","daf","ghi"};
		String[] test2 = {"a","b"};
		String[] test3 = {"zyx","wvu","tsr"};

//		System.out.println(minDeletionSize(test3));
		
		System.out.println(isPalindrome(1230));
	}
	
	// 944. Delete Columns to Make Sorted
	
	// strs = ["cba","daf","ghi"] -> 1
	// strs = ["a","b"] -> 0
	// strs = ["zyx","wvu","tsr"] -> 3
	public static int minDeletionSize(String[] strs){		
		String[] newStrs = new String[strs[0].length()];
		int cnt = 0;
		
		for(int i = 0; i <strs[0].length(); i++) {
			newStrs[i] = "";
			for(int j = 0; j < strs.length; j++) {
				newStrs[i] += strs[j].charAt(i);
			}
		}
		String[] newArrayStrs1 = new String[strs[0].length()];
		String[] newArrayStrs2 = new String[strs[0].length()];
		
		for(int i = 0; i <strs[0].length(); i++) {
			char[] chars = newStrs[i].toCharArray();
			Arrays.sort(chars);
			newArrayStrs1[i] = new String(chars);
		}
		
		for(int i = 0; i < strs[0].length(); i++) {
			if(!newStrs[i].equals(newArrayStrs1[i])) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 9. Palindrome Number
	
	// x = 121 -> true
	// x = -121 -> false
    public static boolean isPalindrome(int x) {
    	String strX = Integer.toString(x);
		for(int i = 0; i < strX.length()/2; i++) {
    		if(strX.charAt(i) != strX.charAt(strX.length() - 1 - i)){
    			return false;
    		}
		}
        return true;
    }
}
