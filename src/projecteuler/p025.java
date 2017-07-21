package projecteuler;

import java.math.BigInteger;

public class p025 {
	public static void main(String[] args){
		/*int n = 1;
		while(nD(n) < 1000){
			n++;
		}
		System.out.println(n);*/
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		int n = 1;
		for(int i = 0; i < 2000; i++){
			BigInteger c = a;
			a = b;
			b = b.add(c);
			n++;
		}
		while(b.toString().length() < 1000){
			BigInteger c = a;
			a = b;
			b = b.add(c);
			n++;
		}
		System.out.println(n+1);
	}
	public static int nD(int n){
		double phi = (1 + Math.sqrt(5))/2;
		double psi = (1 - Math.sqrt(5))/2;
		
		double F = (Math.pow(phi, n) - Math.pow(psi, n))/Math.sqrt(5);
		
		return (int)(Math.log10(F));
	}
}
