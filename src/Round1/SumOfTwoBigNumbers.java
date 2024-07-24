package Round1;

public class SumOfTwoBigNumbers {
	
	public static String add(String s1, String s2) {
		
		if(s1.length()<s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		int ls1 = s1.length()-1;
		int ls2 = s2.length()-1;
		int carry = 0;
		String result = "";
		for (int i = 0; i <= ls1; i++) {
			//int num1 = Integer.parseInt(String.valueOf(s1.charAt(ls1-i)));
			//int num2 = ls2>=i?Integer.parseInt(String.valueOf(s2.charAt(ls2-i))):0;
			int num1 = s1.charAt(ls1-i)-'0';
			int num2 = ls2>=i? s2.charAt(ls2-i)-'0':0;
			int sum = num1 + num2 + carry;
			carry = sum/10; 
			result += sum % 10;
		}
		if(carry!=0) {
			result += carry;
		}
		String sum = "";
		boolean comma = false;
		for (int i = result.length()-1; i >= 0; i--) {
			
			if(i>0 && i%2==0 && !comma) {
				sum += ",";
				if(i<=4)
					comma = true;
			}
			sum += result.charAt(i);
			if(i<=4 && i>0 && i%3==0 && comma) {
				sum += ",";
				
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num = '9'-'0';
		System.out.println(num);
		System.out.println(add("222222222222222222","444444444444e4444444444444"));
	}

}
