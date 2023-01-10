package blackRabbit.week2;

import java.util.Stack;

public class WeekTwo {

	public static void main(String[] args) {
		// 1047
//		System.out.println(removeDuplicates("abbaca"));
		// 1047
		int[] rtnNums = runningSum(new int[] {1,2,3,4,5});
		for(int i = 0; i < rtnNums.length; i++) {
			System.out.print(rtnNums[i] + " ");
		}		
	}

	// 2023. 01. 09
	// 1047. Remove All Adjacent Duplicates In String
	
	// s = "abbaca" -> "ca"
	// s = "azxxzy" -> "ay"
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String rtn = "";
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
        	if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
        		stack.push(s.charAt(i));
        	}else {
        		stack.pop();
        	}
        }
    	while(!stack.isEmpty()) {
    		rtn = stack.pop() + rtn;
    	}
    	return rtn;
    }
	
    // 2023. 01. 10
	// 1047. Remove All Adjacent Duplicates In String
	
    // nums = [1,2,3,4] -> [1,3,6,10]
    // nums = [1,1,1,1,1] -> [1,2,3,4,5]
    public static int[] runningSum(int[] nums) {
    	int[] rtnNums = new int[nums.length];
    	rtnNums[0] = nums[0];
    	for(int i = 1; i < nums.length; i++) {
    		rtnNums[i] = rtnNums[i-1] + nums[i];
    	}
        return rtnNums;
    }
}
