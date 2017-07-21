package projecteuler;

import java.util.ArrayList;

public class p034 {
	public static ArrayList<Integer> fs;
	public static void main(String[] args){
		fs = cF();
		int s= 0;
		for(int i = 3; i < 3000000; i++){
			if(dg(i)){
				s+=i;
				System.out.println(i);
			}
		}
		System.out.println(s);
	}
	public static boolean dg(int a){
		String b = a + "";
		int s = 0;
		for(int i = 0; i < b.length(); i++){
			int c = Integer.parseInt(b.charAt(i) + "");
			s += fs.get(c);
		}
		return a == s;
	}
	public static ArrayList<Integer> cF(){
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			l.add(f(i));
		}
		return l;
	}
	public static int f(int a){
		int p = 1;
		for(int i = 1; i <= a; i++){
			p*=i;
		}
		return p;
	}
}
