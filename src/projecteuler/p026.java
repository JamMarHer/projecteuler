package projecteuler;

import java.util.ArrayList;

public class p026 {
	public static void main(String[] args){
		int m = 0;
		int idx = 0;
		for(int i = 2; i < 1000; i++){
			int t = cycle(i);
			if(t > m){
				m = t;
				idx = i;
			}
		}
		System.out.println(idx + " " + m);
	}
	public static int cycle(int a){
		ArrayList<Integer> l = new ArrayList<Integer>();
		int d = 10;
		while(true){
			//System.out.println(d);
			l.add(d);
			int t = d/a;
			if(t == 0){
				d*=10;
			} else {
				d -= t*a;
				d*=10;
			}
			if(d == 0){
				return 0;
			}
			if(l.contains(d)){
				return l.size() - l.indexOf(d);
			}
		}
	}
}
