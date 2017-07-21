package projecteuler;

public class p014 {
	public static void main(String[] args){
		int m = 0;
		int idx = 0;
		for(int i = 1; i < 1000000; i++){
			int t = ccl(i);
			if(t > m){
				m = t;
				idx = i;
				System.out.println(m + " " + idx);
			}
		}
		System.out.println(idx);
	}
	public static int ccl(long a){
		int c = 0;
		while(a != 1){
			a = a%2==0?(a/2):(3*a+1);
			c++;
		}
		return c;
	}
}
