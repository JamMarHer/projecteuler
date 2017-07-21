package projecteuler;

public class p004 {
	public static void main(String[] args){
		int b = 0;
		for(int i = 100; i <= 999; i++){
			for(int j = i; j <= 999; j++){
				if(iP(i*j) && i*j > b){
					b = i*j;
				}
			}
		}
		System.out.println(b);
	}
	public static boolean iP(int a){
		return (a + "").equals(rv(a+""));
	}
	public static String rv(String s){
		String t = "";
		for(int i = 0; i < s.length(); i++){
			t += s.charAt(s.length() - i - 1);
		}
		return t;
	}
}
