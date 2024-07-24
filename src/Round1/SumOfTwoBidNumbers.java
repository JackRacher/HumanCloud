package Round1;

public class SumOfTwoBidNumbers {
	
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
		for(int i=res.length()-1;i>=0;i--) {
			sum += res.charAt(i);
			if(i>0 && i%3==0) {
				sum += ",";
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add("11,22,33,44444444", "22,33,44,55555555555"));
	}

}
