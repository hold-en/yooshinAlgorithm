import java.util.*;

public class main {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		int[] result = new int[nums.length];

		if (nums.length <= 1) {
			return nums[0];
		}

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					result[i]++;
					result[j]++;
				}
			}
		}
		int num1 = -1;
		for (int j = 0; j < result.length; j++) {
			if (result[j] == 0) {
				num1 = j;
			}
		}

		return nums[num1];
	}
}
