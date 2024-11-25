/*
 * 
 */

import java.util.Scanner;
public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		
		switch(score/10)
		{
		case 9:
			System.out.println(score+"점은 A등급입니다");
			break;
		case 8:
			System.out.println(score+"점은 B등급입니다");
			break;
		case 7:
			System.out.println(score+"점은 C등급입니다");
			break;
		case 6:
			System.out.println(score+"점은 D등급입니다");
			break;
		default:
			System.out.println(score+"는 F등급입니다");
		}
				
	}

}

