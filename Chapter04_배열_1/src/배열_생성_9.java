// 1~10 난수 발생 => 배열[10] => 중복이 없이 저장

import java.util.Arrays;

public class 배열_생성_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr=new int[10]; // 10개의 요소를 가지고 있는 배열
			for(int i=0;i<arr.length;i++)	// 
			{
				arr[i]=(int)(Math.random()*10)+1;  // 1-10
				for(int j=0;j<i;j++) // 
				{
					if(arr[i]==arr[j])
					{
						i--; // => 다시 난수 발생
						break;
					}
				}
						
			}
			System.out.println(Arrays.toString(arr));
		
	
				
	}

}
