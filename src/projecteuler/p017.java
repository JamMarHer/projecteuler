package projecteuler;

public class p017 {
	public static void main(String[] args){
		int s = 0;
		for(int i = 1; i <= 1000; i++){
			System.out.println(i + " " + wl(i) + " " + wls(i));
			s+=wl(i);
		}
		System.out.println(s);
	}
	public static int wl(int a){
		int[] ones = new int[]{0,3,3,5,4,4,3,5,5,4,3};
		int[] teens = new int[]{3,6,6,8,8,7,7,9,8,8};
		int[] tens = new int[]{0,0,6,6,5,5,5,7,6,6};
		int hundred = 7;
		if(a <= 10){
			return ones[a];
		}
		if(a < 20){
			return teens[a-10];
		}
		if(a < 100){
			return tens[a/10] + ones[a%10];
		}
		if(a == 1000){
			return 11;
		}
		return ones[a/100] + hundred + ((a%100!=0)?3:0)+((((a-(a/100)*100)/10)==1)?(teens[a%10]):(tens[(a/10)%10] + ones[a%10]));
	}
	
	public static String wls(int a){
		String[] ones = new String[]{"","one","two","three","four","five","six","seven","eight","nine","ten"};
		String[] teens = new String[]{"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens = new String[]{"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String hundred = "hundred";
		if(a <= 10){
			return ones[a];
		}
		if(a < 20){
			return teens[a-10];
		}
		if(a < 100){
			return tens[a/10] + ones[a%10];
		}
		if(a == 1000){
			return "onethousand";
		}
		return ones[a/100] + hundred + ((a%100!=0)?"and":"")+((((a-(a/100)*100)/10)==1)?(teens[a%10]):(tens[(a/10)%10] + ones[a%10]));
	}
}
