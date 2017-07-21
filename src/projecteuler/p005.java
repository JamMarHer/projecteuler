package projecteuler;

public class p005 {
	public static void main(String[] args){
		int f = 1;
		int v = 20;
		for(int i = 1; i <= v; i++){
			if(iP(i)){
				int c = (int)(Math.log(v)/Math.log(i));
				f *= (int)Math.pow(i,c);
			}
		}
		System.out.println(f);
	}
	public static boolean iP(int a){
		for(int i = 2; i < a; i++){
			if(a % i == 0){
				return false;
			}
		}
		return true;
	}
}
