package projecteuler;

public class p028 {
	public static void main(String[] args){
		int n = 1001;
		int t = 2*n - 1;
		int a = 1;
		int c = 0;
		int b = 2;
		long s = 0;
		while(t > 0){
			s += a;
			a += b;
			c++;
			if(c == 4){
				b+=2;
				c=0;
			}
			t--;
		}
		System.out.println(s);
	}
}
