package projecteuler;

public class p010 {
	public static void main(String[] args){
		long pc = 2;
		for(int i = 3; i < 2000000; i+=2){
			if(iP(i)){
				pc +=i;
			}
		}
		System.out.println(pc);
	}
	public static boolean iP(int a){
		if(a % 2 == 0 && a != 2){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(a); i+=2){
			if(a % i == 0){
				return false;
			}
		}
		return true;
	}
}
