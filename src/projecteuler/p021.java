package projecteuler;

public class p021 {
	public static void main(String[] args){
		int an = 0;
		for(int i = 1; i < 10000; i++){
			an += am(i)?i:0;
			if(am(i)){
				System.out.println(i + " " + d(i));
			}
		}
		System.out.println(an);
	}
	public static boolean am(int a){
		int b = d(a);
		return a == d(b) && a != b;
	}
	public static int d(int a){
		int d = 0;
		for(int i = 1; i <= a/2; i++){
			if(a%i == 0){
				d+= i;
			}
		}
		return d;
	}
}
