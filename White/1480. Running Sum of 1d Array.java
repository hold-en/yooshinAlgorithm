import java.util.*;

public class main {
	public static void main(String[] args) {

		int [] testNum = {1,2,3,4};
		System.out.println(runningSum(testNum));


	}

	  public static int[] runningSum(int[] nums) {
	      int[] num = new int[nums.length];
		  
	      for(int i =0 ; i< nums.length ;i++)
	      {
	    	  for(int j =0; j<=i ; j++)
	    	  {
	    		  num[i]+=nums[j];
	    	  }
	      }
	      
		  return num;
	    }
	}
