import java.util.*;

public class main {
	public static void main(String[] args) {
		// System.out.println(isLongPressedName("alex","aaleex"));
		 System.out.println(isLongPressedName("alex","aaleexa"));
		//System.out.println(isLongPressedName("a", "aaa"));
	}

	public static boolean isLongPressedName(String name, String typed) {

		
		String test = "";
		int end = 0;
		int count = 0;

		System.out.println(name.charAt(name.length()-1));
		System.out.println(typed.charAt(typed.length()-1));
		
		if(name.charAt(name.length()-1)!=typed.charAt(typed.length()-1))
		{
			return false;
		}
		
		
		
		if (name.length() == 1) {
			System.out.println("여기?");
			for (int k = 0; k < typed.length(); k++) {
				if (name.equals(typed.substring(k, k + 1))) {
					System.out.println(typed.substring(k, k + 1));
					count++;
				}
			}
			System.out.println(count);
			if (typed.length() != count) {
				return false;
			} else {
				return true;
			}
		}

		System.out.println(name);
		System.out.println(typed);

		System.out.println();
		for (int i = 0; i < name.length() - 1; i++) {
			test = name.substring(i, i + 2);
			for (int j = end; j < typed.length() - 1; j++) {
				System.out.printf("  name[" + i + "][" + (i + 2) + "]" + " : " + test);
				System.out.println("  typed : " + typed.substring(j, j + 2));
				System.out.println("====================================");
				if (test.equals(typed.substring(j, j + 2))) {
					System.out.println("일치한다");
					end = j + 1;
					count++;
					break;
				}
			}
			System.out.println();
		}

		System.out.println("Length : " + name.length());
		System.out.println("count : " + count);

		if (name.length() - 1 == count) {
			return true;
		}

		return false;
	}

}
