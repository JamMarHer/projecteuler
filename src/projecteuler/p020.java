package projecteuler;

import java.math.BigInteger;

public class p020 {
	public static void main(String[] args){
		BigInteger a = BigInteger.ONE;
		for(int i = 1; i <= 100; i++){
			a = a.multiply(new BigInteger(i + ""));
		}
		System.out.println(sum(a.toString()));
	}
	public static int sum(String n){
		int s = 0;
		for(int i = 0; i < n.length(); i++){
			s += Integer.parseInt(n.charAt(i) + "");
		}
		return s;
	}
}
