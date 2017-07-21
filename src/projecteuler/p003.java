package projecteuler;

public class p003 {
	public static void main(String[] args){
		long a = 600851475143L;
		
		int p = 2;
		int mp = 0;
		while(a != 1){
			if(a % p == 0){
				a = a / p;
				mp = p;
			} else {
				p = p + 1;
			}
		}
		System.out.println(mp);
	}
}
