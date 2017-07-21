package projecteuler;

public class p012 {
	public static void main(String[] args){
		int i = 1;
		while(true){
			i++;
			int t = nF(tri(i));
			if(t-1 > 500){
				System.out.println(tri(i));
				break;
			}
		}
	}
	public static int nF(int a){
		int f = 1;
		for(int i = 2; i <= a; i++){
			int c = 0;
			while(a % i == 0){
				c++;
				a/=i;
			}
			f*=(c+1);
			if(a == 1){
				break;
			}
		}
		return f;
	}
	public static int tri(int a){
		return a*(a+1)/2;
	}
}
