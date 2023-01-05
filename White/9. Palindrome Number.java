import java.util.*;

public class main {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1001));
	}

	public static boolean isPalindrome(int x) {

		boolean result = true;

		int a = x;
		int b = 0;

		if (a < 0 || (a % 10 == 0 && a != 0)) {
			return false;
		}

		if (a == 0) {
			return true;
		}

		while (a != 0) {
			if (a % 10 != 0) {
				b += a % 10;

				if (a > 10) {
					b *= 10;
				}
			} else {
				b *= 10;
			}

			a = a / 10;
		}

		if (x != b) {
			result = false;
		}
		return result;
	}
//
}
