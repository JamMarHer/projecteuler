package projecteuler;

public class p033 {
	public static void main(String[] args){
		int num = 1;
		int dem = 1;
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				for(int k = 1; k <= 9; k++){
					if((10.0*i + k)/(10.0*i + j) == ((k+0.0)/j) && (k+0.0)/j<1){
						num*=k;
						dem*=j;
						System.out.println(i + "" + k + " " + i + ""  + j);
					}
					if((10.0*k + j)/(10.0*i + j) == ((k+0.0)/i) && (k+0.0)/i<1){
						num*=k;
						dem*=i;
						System.out.println(k + "" + j + " " + i + ""  + j);
					}
					if((10.0*j + k)/(10.0*i + j) == ((k+0.0)/i) && (k+0.0)/i<1){
						num*=k;
						dem*=i;
						System.out.println(j + "" + k + " " + i + ""  + j);
					}
					if((10.0*k + i)/(10.0*i + j) == ((k+0.0)/j) && (k+0.0)/j<1){
						num*=k;
						dem*=j;
						System.out.println(k + "" + i + " " + i + ""  + j);
					}
				}
			}
		}
		System.out.println(num + " " + dem);
	}
}
