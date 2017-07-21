package projecteuler;

public class p009 {
	// Hi
	public static void main(String[] args){
		t:for(int b = 1; b <= 1000; b++){
			for(int c = 1; c <= 1000; c++){
				if(1000*1000 + 2*b*b + 2*b*c == 2000* (b+c)){
					System.out.println((1000-b-c) + " " + b + " " + c);
					System.out.println((1000-b-c)*b*c);
					break t;
				}
			}
		}
	}
}
