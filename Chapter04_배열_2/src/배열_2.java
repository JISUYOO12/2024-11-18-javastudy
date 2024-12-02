// char 배열 사용법 / double / String
// => 응용 => 정렬 / 달력 ...
// => 지니뮤직 , 서울 여행 , 맛집 ...
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선언
		char[] alpha=new char[26];
		// 초기화
		char c='A';
		//인덱스 번호
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=c++; //A~Z까지 입력
		}
		// 처리 => (x)
		//출력
		for(char cc:alpha) {
			System.out.print(cc+" ");
		}
		System.out.println();
		int index=0;
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]=='K')
			{
				index=i;
				break;
			}
		}
		System.out.println("K의 위치는"+index);
		// => 'K'자가 있는 인덱스번호를 출력
	}

}
