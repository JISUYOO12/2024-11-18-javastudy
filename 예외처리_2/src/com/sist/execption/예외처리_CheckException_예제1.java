package com.sist.execption;
import java.util.Arrays;


public class 예외처리_CheckException_예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=(int)(Math.random()*45)+1; // 1~45
				for(int j=0;j<i;j++)
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
			}
		Arrays.sort(lotto);
		for(int i:lotto)
		{
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e)
			{
			e.printStackTrace();
			}
			System.out.println(i+" ");{
				
			}
	
		}
	}	
	
}
