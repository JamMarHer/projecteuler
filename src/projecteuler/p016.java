package projecteuler;

public class p016 {
	public static void main(String[] args){
		int[] s = new int[500];
		s[0] = 1;
		for(int i = 0; i < 1000; i++){
			s = m2(s);
		}
		p(s);
		System.out.println(sum(s));
	}
	public static int[] m2(int[] a){
		for(int i = a.length-1; i >= 0; i--){
			if(a[i] > 4){
				a[i+1]++;
			}
			a[i] = (2*a[i])%10;
		}
		return a;
	}
	public static int sum(int[] a){
		int s = 0;
		for(int i = 0; i < a.length; i++){
			s += a[i];
		}
		return s;
	}
	public static void p(int[] a){
		int s = 0;
		for(int i = a.length -1; i >= 0; i--){
			if(a[i] != 0){
				s = i;
				break;
			}
		}
		for(int i = s; i >= 0; i--){
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
