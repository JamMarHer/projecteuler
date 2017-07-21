package projecteuler;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class p013 {
	public static void main(String[] args){
		BigInteger sum = BigInteger.ZERO;
		try (Scanner scanner = new Scanner(new File("rsrc/p013.txt"))) {

			while (scanner.hasNext()){
				BigInteger t = new BigInteger(scanner.nextLine());
				sum = sum.add(t);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sum.toString().substring(0, 10));
	}
}
