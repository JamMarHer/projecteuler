package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class p031 {
	//public static TreeMap<Integer, ArrayList<int[]>> map;
	//public static ArrayList<Integer> coins;
	public static void main(String[] args){
		/*map = new TreeMap<Integer, ArrayList<int[]>>();
		coins = new ArrayList<Integer>();
		coins.addAll(Arrays.asList(1,2,5,10,20,50,100,200));
		ArrayList<int[]> a = solve(10);
		TreeSet<String> set = new TreeSet<String>();
		for(int i = 0; i < a.size(); i++){
			String s = "";
			for(int j = 0; j < a.get(i).length; j++){
				s+=a.get(i)[j] + ",";
			}
			System.out.println(s);
			set.add(s);
		}
		System.out.println(set.size());*/
		ArrayList<Integer> coins = new ArrayList<Integer>();
		coins.addAll(Arrays.asList(2,5,10,20,50,100,200));
		Collections.reverse(coins);
		System.out.println(solve(200, coins, 0));
	}
	public static int solve(int a, ArrayList<Integer> coins, int id){
		if(id == 7){
			//System.out.println(a);
			return 1;
		}
		int s = 0;
		for(int i = 0; i <= a/coins.get(id); i++){
			int b = solve(a-coins.get(id)*i, coins, id+1);
			//if(id == 0){
			//	System.out.println(id + ": " + i + " " + b);
			//}
			s+=b;
		}
		return s;
	}
	/*public static ArrayList<int[]> solve(int a){
		if(a < 0){
			return new ArrayList<int[]>();
		}
		if(a == 0){
			ArrayList<int[]> te = new ArrayList<int[]>();
			te.add(new int[]{0,0,0,0,0,0,0,0});
			return te;
		}
		if(map.containsKey(a)){
			return map.get(a);
		}
		TreeSet<String> set = new TreeSet<String>();
		ArrayList<int[]> s = new ArrayList<int[]>();
		for(int i = 0; i < coins.size(); i++){
			ArrayList<int[]> t = solve(a - coins.get(i));
			for(int j = 0; j < t.size(); j++){
				t.get(j)[i] ++;
				String str = "";
				for(int k = 0; k < t.get(j).length; k++){
					str+=t.get(j)[k] + ",";
				}
				if(!set.contains(str)){
					s.add(t.get(j));
					set.add(str);
					System.out.println(set + " " + a + " " + i);
				} else {
					System.out.println("Hi");
				}
			}
		}
		map.put(a, s);
		return s;
	}*/
}
