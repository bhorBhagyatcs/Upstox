
public class FibonacciSeries {
	public static void main(String[] args) {
		int num= 10 ;
		// 1 1 2 3 5 8 
		int f1,f2=0;
		int f3=1;
		for(int i=1;i<=num;i++) {
		System.out.print(f3+ " ");
		f1=f2;
		f2=f3;
		f3=f1+f2;
	
	}

}
}