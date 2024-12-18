
public class 예외처리_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		divide(num1, num2);
	}
		private static void divide(int num1, int num2) throws ArithmeticException{
			System.out.println(num1/num2);
		}

}

