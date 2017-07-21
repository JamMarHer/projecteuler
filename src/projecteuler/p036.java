package projecteuler;

public class p036 {
	public static void main(String[] args){
		int s = 0;
		for(int i = 1; i < 1000000; i++){
			if(pal(i + "") && pal(Integer.toBinaryString(i))){
				s += i;
				System.out.println(i + " " + Integer.toBinaryString(i)); 
			}
		}
		System.out.println(s);
	}
	public static boolean pal(String a){
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != a.charAt(a.length() -1 - i)){
				return false;
			}
		}
		return true;
	}
}
