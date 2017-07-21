package projecteuler;

public class p027 {
	public static void main(String[] args){
		int m = 0;
		int f = 0;
		for(int a = -1000; a <= 1000; a++){
			for(int b = -1000; b <=1000; b++){
				int t = cp(a,b);
				if(t > m){
					m = t;
					f = a*b;
					System.out.println(m + " " + a + " " + b);
				}
			}
		}
		System.out.println(f);
	}
	public static int cp(int a, int b){
		long n = 0;
		while(prime(n*n + a*n + b)){
			n++;
		}
		return (int)n;
	}
	public static boolean prime(long a){
		if(a <= 1){
			return false;
		}
		if(a == 2){
			return true;
		} else if (a %2 == 0){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(a); i+=2){
			if(a%i == 0){
				return false;
			}
		}
		return true;
	}
}

