//select 정렬
public class 배열응용_6 {
	//static void sort(int[] arr);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println("정렬전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("정렬 후:");
		//배열응용_4.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
		
	}

}
