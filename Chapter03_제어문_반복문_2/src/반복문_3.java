/*
 * => 정렬, 빈도수 구하기 => 알고리즘
 */
//주사위 2개 => 6이 나오는 경우의 수를 출력
			/*
			 * 1 5
			 * 2 4
			 * 3 3
			 * 4 2
			 * 5 1
			 * 
			 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i+j==6)
				{
					//System.out.println("["+i+","+j+"]");
					System.out.printf("[%d,%d]\n",i,j);
				}
			
			}
		}

	}
}
*/

		/*for(int i=1;i<=4;i++) 
		{//공백
			for(int j=1;j<=i-1; j++)
			{
				System.out.print(" ");
			}
			//별표
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			}

	}
}*/

/*
		char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}

}
*/
		/*
		for(int i=1;i<=3;i++)
		{
			char c='A';
			for(int j=1;j<=4;j++)  //1 => 2 B   2=>3 C 3=>4 D
			{
				System.out.print(c++);
			}	
			System.out.println();
		}
	}

}*/
		
		
		char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}

	}
}
		
		
	/*	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print("#");
				else
					System.out.print(j);
			}
			
			System.out.println();
		}
			}

	}
}*/
		
		/*
		 * ★ 
		 * ★ ★ 
		 * ★ ★ ★ 
		 * ★ ★ ★ ★ 
		 * i    j 
		 * 줄수	별표 => i=j
		 */
		/*
		 * 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print('★');
			}
			System.out.println();
		}
			}

	}
}
		*/
		/*		i j   i+j=5
		 * 			  j=5-i
				1 4 
				2 3
				3 4
				4 1
		*/	
		
