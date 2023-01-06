import java.util.*;

public class main {
	public static void main(String[] args) {
		int[] target = { 392, 360 };
		int[] arr = { 392,360};
		System.out.println(canBeEqual(target, arr));
	}

	public static boolean canBeEqual(int[] target, int[] arr) {

		// bubble sort
		int tmpTarget = 0;
		int tmpArr = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (target[i] > target[j]) {
					
					tmpTarget = target[i];
					target[i] = target[j];
					target[j] = tmpTarget;
				}
				if (arr[i] > arr[j]) {

					tmpArr = arr[i];
					arr[i] = arr[j];
					arr[j] = tmpArr;
				}

			}
			System.out.println();
		}

		for (int k = 0; k < arr.length; k++) {
			if (target[k] != arr[k])
				return false;
		}

		return true;
	}

}
