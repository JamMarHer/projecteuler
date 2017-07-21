package projecteuler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p022 {
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		try (Scanner scanner = new Scanner(new File("rsrc/p022.txt"))) {

			String[] spl = scanner.nextLine().replaceAll("\"", "").split(",");
			names.addAll(Arrays.asList(spl));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Collections.sort(names);
		
		long t = 0;
		
		for(int i = 0; i < names.size(); i++){
			t+= ns(names.get(i)) * (i+1);
		}
		System.out.println(t);
	}
	public static long ns(String s){
		long a = 0;
		for(int i = 0; i < s.length(); i++){
			a += s.charAt(i) - 64;
		}
		return a;
	}
}
