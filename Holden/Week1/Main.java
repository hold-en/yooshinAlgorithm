package blackRabbit.week1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] test1 = {"cba","daf","ghi"};
		String[] test2 = {"a","b"};
		String[] test3 = {"zyx","wvu","tsr"};

//		System.out.println(minDeletionSize(test3));
		
//		System.out.println(isPalindrome(1230));
		System.out.println(singleNumber(new int[] {1,2,4,4,2}));
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
    
    // 136. Single Number
    
    // nums = [2,2,1] -> 1
    //	nums = [4,1,2,1,2] -> 4
    // nums = [1] -> 1
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(int ans : map.keySet()){
            if(map.get(ans) == 1)
                return ans;
        }
        return 0;
    }
}
