import java.util.Scanner;
public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num1=scan.nextInt();
		System.out.print("정수입력:");
		int num2=scan.nextInt();
		switch(scan.next())
		{
		case "+":
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-":
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case "*":
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case "/":
			if(num2==0)
				System.out.println("0으로 나눌 수 없다");
			else
				System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		}
		
	}

}
