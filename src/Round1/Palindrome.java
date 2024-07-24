package Round1;

public class Palindrome 
{
	public static boolean isPalindrome(String s) {
		int l = 0, r = s.length()-1;
		boolean status = true;
		while(l <= r) {
			if(s.charAt(l)!=s.charAt(r)) {
				
				status = false;
				break;
			}
			
			l++;
			r--;
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("maddammmmmm"));
	}
}
