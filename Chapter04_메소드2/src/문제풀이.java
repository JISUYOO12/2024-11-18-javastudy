public class 문제풀이 {
	/*static int print3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}*/
	/*static void change(String s)
	{
		//자체에서 처리 => 영역에서 출력
		s=s.toUpperCase();
		System.out.println(s);
	}
	static String change2(String s)
	{
		return s.toUpperCase();
	}*/
	/*static void reverse(String s)
	{
	// 거꾸로 출력하는 라이브러리	
	//	new StringBuilder(s).reverse()
	//	System.out.println(new StringBuilder(s).reverse()); //new => 생성자
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}*/
	//6
	/*
	 * 경우의 수는 3개
	 */
	static String change3(String s)
	{
		if(s.length()%2!=0)
			return "문자열 갯수가 짝수이여야 합니다.";
		String res=""; //둘중에 한개만 전송 / 변수
		boolean bCheck=true; //같은 문자인지 비교
		/*
		 * A B B A
		 * -	 -
		 *   - -
		 */
		for(int i=0;i<s.length()/2;i++)
		{
			char start=s.charAt(i);
			char end=s.charAt(s.length()-1-i); //s.length-1 s/length-2 
			if(start!=end)
			{
				bCheck=false;
				break;
			}	
		}
		if(bCheck==true)
			res="좌우대칭입니다";
		else
			res="좌우대칭이 아닙니다";
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int hap=print3(1000);
		System.out.println("1-1000까지의 합:"+hap);*/
		/*change("abcDEFgh");
		String s=change2("abcDEFgh");*/
		//reverse("abcdefg");
	}

}
