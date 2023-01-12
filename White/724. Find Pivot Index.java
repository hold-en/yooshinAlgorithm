import java.util.*;

public class main {
	public static void main(String[] args) {

		int[] testNum = { 1, 7, 3, 6, 5, 6 };
		// System.out.println(testNum.length);
		System.out.println(pivotIndex(testNum));

	}

	public static int pivotIndex(int[] nums) {

		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];

		leftSum[0] = nums[0];
		rightSum[0] = nums[nums.length - 1];

		for (int i = 1; i < nums.length; i++) {
			leftSum[i] = leftSum[i - 1] + nums[i];
			rightSum[i] = rightSum[i - 1] + nums[(nums.length - 1) - i];
		}

		for (int j = 0; j < nums.length; j++) {
			for (int k = 0; k < nums.length; k++) {

				if ((leftSum[j] == rightSum[k]) && ((j + k) == nums.length - 1)) {
					return j;
				}
			}
		}

		return -1;
	}
}
