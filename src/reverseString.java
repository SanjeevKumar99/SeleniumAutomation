
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// 2 method

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}
}
