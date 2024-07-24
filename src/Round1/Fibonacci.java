package Round1;

public class Fibonacci {

	public static String fibonacci(int num) {
		if(num <= 0) {
			return "0";
		}
		if(num == 1) {
			return "1";
		}
		else {
			String f1 = "0", f2 = "1";
			String res = "";
			for (int i = 2; i <= num; i++) {
				res = add(f1, f2);
				f1 = f2;
				f2 = res;
				
			}
			String sum = "";
			for(int i=0;i<=res.length()-1;i++) {
				
				if(i>0 && i%3==0) {
					sum += ",";
				}
				sum += res.charAt(i);
				
			}
			return sum;
		}
	}
	
	public static String add(String s1, String s2) {
		String ns1 = s1.replaceAll(",", "");
		String ns2 = s2.replaceAll(",", "");
		if(ns1.length()<ns2.length()) {
			String temp = ns1;
			ns1 = ns2;
			ns2 = temp;
		}
		int ls1 = ns1.length()-1;
		int ls2 = ns2.length()-1;
		int carry = 0; 
		String res = "";
		for (int i = 0; i <= ls1; i++) {
			int num1 = Integer.parseInt(String.valueOf(ns1.charAt(ls1-i)));
			int num2 = ls2>=i?Integer.parseInt(String.valueOf(ns2.charAt(ls2-i))):0;
			int sum = num1 + num2 +carry;
			carry = sum /10;
			res += sum % 10;
		}
		if(carry!=0) {
			res += carry;
		}
		String sum = "";
		for (int i = res.length()-1; i >= 0; i--) {
			sum += res.charAt(i);
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(100));
	}
}
