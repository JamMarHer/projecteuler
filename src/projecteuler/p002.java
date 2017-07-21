package projecteuler;

import java.util.ArrayList;

public class p002 {
	public static ArrayList<Long> values;
	public static void main(String[] args){
		values = new ArrayList<Long>();
		values.add(1L);
		values.add(1L);
		long next = 0;
		while(next < 4000000){
			next = values.get(values.size() - 1) + values.get(values.size() - 2);
			values.add(next);
		}
		System.out.println(values);
		long sum = 0;
		for(int i = 0; i < values.size(); i++){
			if(values.get(i)%2 == 0){
				sum+= values.get(i);
			}
		}
		System.out.println(sum);
	}
}
