package projecteuler;

import java.util.ArrayList;

public class p035 {
	public static void main(String[] args){
		ArrayList<Integer> ps = pg(1000000);
		int c = 0;
		for(int i: ps){
			if(c(i,ps)){
				c++;
			}
		}
		System.out.println(c);
	}
	public static boolean c(int p, ArrayList<Integer> ps){
		String pi = p + "";
		String c = pi.substring(1) + pi.charAt(0);
		while(!c.equals(pi)){
			if(!ps.contains(Integer.parseInt(c))){
				return false;
			}
			c = c.substring(1) + c.charAt(0);
		}
		return true;
	}
	public static ArrayList<Integer> pg(int n){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		for(int i = 3; i < n; i+=2){
			if(p(i,l)){
				l.add(i);
			}
		}
		return l;
	}
	public static boolean p(int n, ArrayList<Integer> p){
		for(int i = 0; i < p.size(); i++){
			int j = p.get(i);
			if(j > Math.sqrt(n)){
				return true;
			}
			if(n%j == 0){
				return false;
			}
		}
		return true;
	}
}
