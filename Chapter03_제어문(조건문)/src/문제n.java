/*
 * 
 */
//9번
/*import java.util.Scanner;
public class 문제n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		if(num>=0)
			System.out.println(num+"는(은 양수입니다)");
		if(num<0)
			System.out.println(num+"는(은 음수입니다)");
	    
	}

}

//10번
import java.util.Scanner;
public class 문제n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		if(num%3==0)
			System.out.println(num"+은(는)3의 배수입니다");
		if(num%3!=0)
			System.out.println(num+"은(는) 3의 배수가 아닙니다.");
	    
	}

}
*/
//11번
//import java.util.Scanner;
//public class 문제n {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("2자리의 정수(10~99):");
//		int num=scan.nextInt();
//		int a=num/10;
//		int b=num%10;
//		if(a==b) 
//			System.out.println("10의 자리와 1의자리가 같습니다.");
//		if(a!=b) 
//			System.out.println("10의 자리와 1의자리가 같지 않습니다.");
//		
//	    
//	}
//
//}


//12번
import java.util.Scanner;
public class 문제n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("답을입력하세요(1~12):");
		int month=scan.nextInt();
		if(month>=3 && month<=5)
			System.out.println("봄");
		if(month>=6 && month<=8)
			System.out.println("여름");
		if(month>=9 && month<=11)
			System.out.println("가을");
		if(month==1 || month==2 ||month==12)
			System.out.println("겨울");
	}
	
}

