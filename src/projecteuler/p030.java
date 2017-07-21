package projecteuler;

public class p030 {
	public static void main(String[] args){
		int s = 0;
		for(int i = 2; i <= 999999; i++){
			if(check(i,5)){
				s+= i;
				System.out.println(i);
			}
		}
		System.out.println(s);
	}
	public static boolean check(int a, int p){
		String b = a + "";
		int s = 0;
		for(int i = 0; i < b.length(); i++){
			s+=Math.pow(Integer.parseInt(b.charAt(i) + ""), p);
		}
		return s == a;
	}
}
