package projecteuler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class p018 {
	public static void main(String[] args){
		ArrayList<int[]> tri = new ArrayList<int[]>();
		try (Scanner scanner = new Scanner(new File("rsrc/p018.txt"))) {

			while (scanner.hasNext()){
				String s = scanner.nextLine();
				String[] spl = s.split(" ");
				int[] l = new int[spl.length];
				for(int i = 0; i < spl.length; i++){
					l[i] = Integer.parseInt(spl[i]);
				}
				tri.add(l);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = tri.size() - 2; i >=0; i--){
			for(int j = 0; j < tri.get(i).length; j++){
				tri.get(i)[j] += Math.max(tri.get(i+1)[j], tri.get(i+1)[j+1]);
			}
		}
		System.out.println(tri.get(0)[0]);
		
	}
}
