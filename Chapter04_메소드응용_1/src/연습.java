import java.util.Scanner;
public class 연습 {

	public 연습() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도입력:");
		int year=scan.nextInt();
		System.out.println("월 입력");
		int month=scan.nextInt();
		String[] strWeek= {"일","월","화","수","목","금","토"};
		//~전년도까지 총 일수 구하기
		int total=(year-1)*365+(year-1)*100-(year-1)*4+(year-1)*400;
		//전달까지 총 달수
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		

	}

}
