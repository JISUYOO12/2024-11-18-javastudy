
public class 문제풀이14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int k=1;
		for(int i=1;i<=5;i++)   //1 
		{	
			for(int j=1;j<=5;j++)  //1
			{	
				System.out.print(k);
				
			}
			k++;
			System.out.println();
		}*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}

}
