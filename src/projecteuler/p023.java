package projecteuler;

import java.util.ArrayList;
import java.util.TreeSet;

public class p023 {
	public static void main(String[] args){
		ArrayList<Integer> abnt = new ArrayList<Integer>();
		for(int i = 1; i < 28123; i++){
			if(ab(i)){
				abnt.add(i);
			}
		}
		//System.out.println("Part I");
		TreeSet<Integer> s = new TreeSet<Integer>();
		for(int i = 0; i < abnt.size(); i++){
			for(int j = i; j < abnt.size(); j++){
				if(abnt.get(i) + abnt.get(j) < 28123){
					s.add(abnt.get(i) + abnt.get(j));
				} else {
					break;
				}
			}
		}
		//System.out.println("Part II");
		//ArrayList<Integer> ns = new ArrayList<Integer>();
		//System.out.println(s.size());
		long d = 0;
		for(int i = 0; i < 28123; i++){
			if(!s.contains(i)){
				//ns.add(i);
				d+=i;
			}
		}
		System.out.println(d);
		//System.out.println(ns);
	}
	public static boolean ab(int a){
		int s = 0;
		for(int i = 1; i < a; i++){
			if(a % i == 0){
				s+=i;
			}
		}
		return s > a;
	}
}
