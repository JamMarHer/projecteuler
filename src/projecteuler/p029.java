package projecteuler;

import java.util.TreeSet;

public class p029 {
	public static void main(String[] args){
		/*TreeSet<String> l = new TreeSet<String>();
		for(int a = 100; a >= 2; a--){
			for(int b = 100; b >= 2; b--){
				int c = a;
				int d = 1;
				boolean found = false;
				while(c <= 100){
					if(b%d == 0 && l.contains(c + " " + b/d)){
						System.out.println(a + " " + b);
						found = true;
						break;
					}
					c *= a;
					d ++;
				}
				if(!found){
					//System.out.println(a + " " + b + " " + (int)Math.pow(a,b));
					l.add(a + " " + b);
				}
			}
		}
		System.out.println(l);
		System.out.println(l.size());*/
		TreeSet<Double> set = new TreeSet<Double>();
		for(int a = 100; a >= 2; a--){
			for(int b = 100; b >= 2; b--){
				set.add(Math.pow(a,b));
			}
		}
		System.out.println(set.size());
	}
}
