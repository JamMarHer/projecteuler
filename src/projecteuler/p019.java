package projecteuler;

import java.util.Calendar;

public class p019 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		int ct = 0;
		for(int i = 1901; i <= 2000; i++){
			for(int j = 1; j <= 12; j++){
				c.set(i, j, 1);
				if(c.get(Calendar.DAY_OF_WEEK) == 4){
					ct++;
				}
			}
		}
		System.out.println(ct);
		//1200/7
	}
}
