package projecteuler;

public class p015 {
	public static void main(String[] args){
		long a = 1;
		for(int i = 1; i <= 20; i++){
			a*=(i+20);
			a/=i;
		}
		System.out.println(a);
	}
}
