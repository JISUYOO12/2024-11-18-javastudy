// 사용자로부터 값을 받아서 => 해당 구구단을 출력

/*
 *  >>5
 *  5*1=5
 *  5*2=10
 *  ..
 *  ..
 *  5*9=45
 */
import java.util.Scanner;
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력(2~9)");
		int dan=scan.nextInt();
		System.out.println("====요청 결과값====");
		for(int i=1;i<=9;i++) // for은 일정 패턴을 가지고 있어야 출력이 가능
			System.out.println(dan+"*"+i+"="+dan*i);
	}

}
