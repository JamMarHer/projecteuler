package projecteuler;

import java.util.ArrayList;

public class p037 {
	public static void main(String[] args){
		ArrayList<Integer> ps = pg(1000000);
		//System.out.println(tr(3797, ps));
		int s = 0;
		for(int i: ps){
			if(tr(i,ps)){
				s+=i;
				System.out.println(i);
			}
		}
		System.out.println(s - 17);
	}
	public static boolean tr(int a, ArrayList<Integer> ps){
		String b = a + "";
		for(int i = 0; i < b.length(); i++){
			if(!ps.contains(Integer.parseInt(b.substring(i)))){
				return false;
			}
			if(!ps.contains(Integer.parseInt(b.substring(0, b.length() - i)))){
				return false;
			}
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
