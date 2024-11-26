/*
 * for(int i=1;i<=3;i++)
 * {
 * 	for(int j=1;j<=3;j++)
 *  {
 * 	if(j==2)
 * 		break; ==> j가 있는 for문만 제어
 *  }
 * }
 * i=1 ==> j=1
 * i=2 ==> j=1
 * j=3 ==> j=1
 * 
 * i=1 ==> j=1 j=2 j=3
 * i=2 ==> j=1 j=2 j=3
 * i=3 ==> j=1 j=2 j=3
 * j=4 ==> 종료
 */
public class 반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2) 
					break; //이름이 있는 break(break outer) => 많이 사용하지 않는다 
				System.out.println("i="+i+",j="+j);
			}
		}
		
	}
	
}
