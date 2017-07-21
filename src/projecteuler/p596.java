package projecteuler;

import java.util.TreeMap;

public class p596 {
	public static TreeMap<String, Long> map;
	public static int c = 0;
	public static void main(String[] args){
		map = new TreeMap<String, Long>();
		for(int i = 0; i < 1000; i++){
			long s = solve(i);
			double d = (Math.PI * Math.PI / 2)*(Math.pow(i, 4));
			System.out.println(i + " " + (s-d) + " " + s);
		}
		System.out.println(solve(10000));
		System.out.println(c);
	}
	
	public static long solve(long r){
		return A(4,r*r);
	}
	
	public static long A(long k, long x){
		if(map.containsKey(k + " " + x)){
			c++;
			return map.get(k + " " + x);
		}
		if(k == 1){
			if(x == 0){
				map.put(k + " " + x, 1L);
				return 1;
			}
			long tmp = 1;
			for(int i = 1; i <= x; i++){
				tmp += 2*delta(i);
			}
			map.put(k + " " + x, tmp);
			return tmp;
		}
		long sum = A(k-1, x);
		for(int i = 1; i <= Math.floor(Math.sqrt(x)); i++){
			sum += 2 * A(k-1, x - i*i);
		}
		map.put(k + " " + x, sum);
		return sum;
	}
	
	public static long delta(long x){
		return isSquare(x)?1:0;
	}
	
	public static boolean isSquare(long n){
		double sqrt = Math.sqrt(n);
		long x = (long) sqrt;
		return Math.pow(sqrt,2) == Math.pow(x,2);
	}
}
