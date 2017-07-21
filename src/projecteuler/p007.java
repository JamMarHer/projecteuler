package projecteuler;

public class p007 {
	public static void main(String[] args){
		int pc = 0;
		int i = 2;
		while(pc < 10001){
			if(iP(i)){
				pc ++;
			}
			i++;
		}
		System.out.println(i-1);
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
