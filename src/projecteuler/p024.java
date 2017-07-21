package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

public class p024 {
	public static void main(String[] args){
		System.out.println(perm(1000000));
	}
	public static String perm(int n){
		ArrayList<Long> t = new ArrayList<Long>();
		t.addAll(Arrays.asList(0L,1L,2L,3L,4L,5L,6L,7L,8L,9L));
		return permD(n-1, 10, t);
	}
	public static String permD(int n, int i, ArrayList<Long> r){
		if(i == 0){
			return "";
		}
		//System.out.println(r.get((int)(n/(fact(i-1)))));
		String s = r.get((int)(n/(fact(i-1)))) + "";
		r.remove((int)(n/(fact(i-1))));
		s += permD((int)(n % (fact(i-1))), i-1, r);
		return s;
	}
	public static long fact(long a){
		long m = 1;
		for(long i = 1; i <= a; i++){
			m*=i;
		}
		return m;
	}
}
