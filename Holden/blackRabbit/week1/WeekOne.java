package blackRabbit.week1;

import java.util.*;

public class WeekOne {
	public static void main(String[] args) {
//		System.out.println(minDeletionSize(new Stinrg[] {"cba","daf","ghi"));		
//		System.out.println(isPalindrome(1230));
//		System.out.println(singleNumber(new int[] {1,2,4,4,2}));
		System.out.println(canBeEqual(new int[] {1,3,2,4}, new int[] {1,4,3,2}));
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
    
    // 1460. Make Two Arrays Equal by Reversing Subarrays
    
    // target = [1,2,3,4], arr = [2,4,1,3] -> true
    // target = [7], arr = [7] -> true
    // target = [3,7,9], arr = [3,7,11] -> false
    public static boolean canBeEqual(int[] target, int[] arr) {
    	Arrays.sort(target);
    	Arrays.sort(arr);
    	if(Arrays.equals(target, arr)) {
    		return true;
    	}
        return false;
    }
}
