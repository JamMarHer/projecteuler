package projecteuler;

import java.util.ArrayList;
import java.util.TreeSet;

public class p032 {
	public static TreeSet<Integer> seen;
	public static void main(String[] args){
		seen = new TreeSet<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> m = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++){
			r.add(i);
		}
		System.out.println(pnd(r,0,m));
	}
	public static int pnd(ArrayList<Integer> r, int c, ArrayList<Integer> m){
		if(c == 5){
			int s = 0;
			int t= check(m);
			if(seen.contains(t) || t== -1){
				s+= 0;
			} else {
				System.out.println(m + " " + t);
				seen.add(t);
				s+= t;
			}
			t= check2(m);
			if(seen.contains(t) || t== -1){
				s+= 0;
			} else {
				System.out.println(m + " " + t);
				seen.add(t);
				s+= t;
			}
			return s;
		}
		int s = 0;
		for(int i = 0; i < r.size(); i++){
			m.add(r.get(i));
			r.remove(i);
			s += pnd(r, c+1, m);
			if(i == r.size()+1){
				r.add(m.get(m.size() - 1));
			}else {
				r.add(i,m.get(m.size() - 1));
			}
			m.remove(m.size() -1);
		}
		return s;
	}
	public static int check(ArrayList<Integer> m){
		int a = m.get(0) * 10 + m.get(1);
		int b = m.get(2)*100 + m.get(3)*10 + m.get(4);
		int c = a*b;
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.addAll(m);
		String d = c+ "";
		for(int i = 0; i <d.length(); i++){
			if(set.contains(Integer.parseInt(d.charAt(i) + ""))){
				return -1;
			}
			set.add(Integer.parseInt(d.charAt(i) + ""));
		}
		if(set.contains(0)){
			return -1;
		}
		return (set.size() == 9)?c:-1;
	}
	public static int check2(ArrayList<Integer> m){
		int a = m.get(0);
		int b = m.get(1)*1000 + m.get(2)*100 + m.get(3)*10 + m.get(4);
		int c = a*b;
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.addAll(m);
		String d = c+ "";
		for(int i = 0; i <d.length(); i++){
			if(set.contains(Integer.parseInt(d.charAt(i) + ""))){
				return -1;
			}
			set.add(Integer.parseInt(d.charAt(i) + ""));
		}
		if(set.contains(0)){
			return -1;
		}
		return (set.size() == 9)?c:-1;
	}
	
}
