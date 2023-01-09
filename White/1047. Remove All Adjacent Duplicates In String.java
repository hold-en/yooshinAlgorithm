import java.util.*;

public class main {
	public static void main(String[] args) {

		removeDuplicates("aaaaaaaaa");

	}

	public static String removeDuplicates(String s) {
		Stack<String> str = new Stack<>();
		str.push(s.substring(0, 1));

		for (int i = 1; i < s.length(); i++) {
			if (str.isEmpty()) {
				if (i + 1 < s.length()) {
					str.push(s.substring(i, i + 1));
					i++;
				} else {

					str.push(s.substring(i, i + 1));
					break;
				}
			}

			if (str.peek().equals(s.substring(i, i + 1))) {

				str.pop();
			} else {
				str.push(s.substring(i, i + 1));

			}
		}
		/*
		 * while (!str.isEmpty()) { String item = str.pop(); System.out.println(item); }
		 */
		String strValue = "";
		for (String str2 : str) {
			strValue += str2;

		}
		return strValue;
	}
}
