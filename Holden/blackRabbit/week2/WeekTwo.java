package blackRabbit.week2;

import java.util.Stack;

public class WeekTwo {

	public static void main(String[] args) {
		// 1047
		System.out.println(removeDuplicates("abbaca"));
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
}
