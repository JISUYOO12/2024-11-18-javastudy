import java.util.Scanner;
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2)");
		int player=scan.nextInt();
		int com=(int)(Math.random()*3); //012
		String[] str= {"가위","바위","보"};
		System.out.println("컴퓨터:"+str[com]);
		System.out.println("player:"+str[player]);
		System.out.println("=====결과====");
		// if(com==0 && player==0)
		// if(com==0 && player==1)
		// if(com==0 && player==2)
		/*int res=com-player;
		if(res==-1 || res==2)
		{
			System.out.println("player Win!!");
		}
		if(res==1 || res==-2)
		{
			System.out.println("컴퓨터 Win!!");
		}
		if(res==0)
		{
			System.out.println("비겼다");
		}
		*/
		
		if(player==0 && com==0)
			System.out.println("비겼다");
		if(player==1 && com==2)
			System.out.println("player win");
		if(player==2 && com==1)
			System.out.println("컴퓨터 win");
		
		if(player==0 && com==1)
			System.out.println("컴퓨터 win");
		if(player==1 && com==0)
			System.out.println("player win");
		if(player==2 && com==2)
			System.out.println("비겼다");
		
		if(player==0 && com==0)
			System.out.println("비겼다");
		if(player==1 && com==2)
			System.out.println("player win");
		if(player==2 && com==1)
			System.out.println("컴퓨터 win");
		
				
	}

}
