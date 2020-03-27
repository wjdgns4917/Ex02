import java.util.Scanner;

	public class math2{
		public static void main(String []args){
			double num1=0;
			double num2=0;
			String oper="";

			Scanner sc=new Scanner(System.in);
			System.out.println("Insert the first number");
			num1=sc.nextInt();

			System.out.println("insert add,min,mult,div");
			oper=sc.next();

			System.out.println("Insert the second number");
			num2=sc.nextInt();

			double result1=num1+num2;
			double result2=num1-num2;
			double result3=num1*num2;
			double result4=num1/num2;

			if(oper.equals("add")) {
					System.out.println(result1);
			}
			else if(oper.equals("min")) {
					System.out.println(result2);
			}
			else if(oper.equals("mult")) {
					System.out.println(result3);		
			}
			else{
					System.out.println(result4);
				}
				
	}

}
