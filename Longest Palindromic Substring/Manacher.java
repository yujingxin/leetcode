import java.util.ArrayList;

// Manacher algorithm
public class LongestParlindrome {
		public static void main(String[] Args) {
			String s = "babad";
			String m = manacherTrans(s);
			String a = longestPalindrome(m);
			System.out.println(a);
			
		}
		
		private static String manacherTrans(String s) {
			ArrayList trans = new ArrayList();
			String[] a = s.split("");
			trans.add("#");
			for (int i = 0; i < s.length(); i++) {
				trans.add(a[i]);
				trans.add("#");
			}
			String ans = String.join("", trans);
			return ans;
			
		}
		
		public static  String longestPalindrome(String s) {
			int count = 0, center = 0, radi = 0;
			
			for (int i = 0; i < s.length(); i++) {
				int j = 0;
				while(i-j >= 0 && j+i < s.length() && s.charAt(i-j) == s.charAt(i+j)) {
			
					if(j >= count) {
						count = j;
						center = i;
						radi = j;
					}
					j++;
				}
			}
			String ans = s.substring(center-radi, center+radi);
			return String.join("", ans.split("#"));
			
	}
}
