
public class math3 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum=sum+i;
			System.out.print(i+" ");
			if (i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println("sum : "+sum);
	
	}

}

