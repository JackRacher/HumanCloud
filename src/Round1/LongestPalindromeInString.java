package Round1;

public class LongestPalindromeInString 
{
	 public static boolean isPalindrome(String s) {
	        int l = 0, r = s.length() - 1;
	        while (l < r) {
	            if (s.charAt(l) != s.charAt(r)) {
	                return false;
	            }
	            l++;
	            r--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        // Test with a sample string
	        String s = "qwertmaadaamyuiopasdfmaaaadaaaamghjklzxcvbnm";
	        String longPalindrom = "";
	        int maxLength = 0;

	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i; j < s.length(); j++) {
	                String ps = s.substring(i, j + 1);
	                if (isPalindrome(ps) && ps.length() > maxLength) {
	                    longPalindrom = ps;
	                    maxLength = ps.length();
	                }
	            }
	        }

	        System.out.println(longPalindrom);
	    }

}
