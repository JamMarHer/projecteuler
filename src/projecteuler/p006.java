package projecteuler;

public class p006 {
	public static void main(String[] args){
		long ssq = 0;
		long sqs = 0;
		for(int i = 1; i <= 100; i++){
			ssq += i*i;
			sqs += i;
		}
		System.out.println(sqs*sqs - ssq);
	}
}
