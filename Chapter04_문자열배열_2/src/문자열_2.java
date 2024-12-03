import java.util.*;
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 새로운 메모리 저장공간을 생성해라 => new
		//for문안에 들어가면 안돼 입력값 하나만 있으면 되니까
		String[] ids= {"admin","hong","park","kim","shim"};
		String[] pwds= {"1234","1234","1234","1234"};
		String[] names= {"이순신","홍길동","박문수","김두한","심청이"};
		
		// 로그인 처리
		System.out.print("ID를 입력:");
		String id=scan.next();
		System.out.print("비밀번호를 입력:");
		String pwd=scan.next(); // pwd 암호화 /복호화
		// encoder => decorder 
		
		// 1. id 체크 
		int count=0; // 반복문은 무조건 처음부터 ~~~ 디폴트값을 잡아줌 
		int index=0;
		for(int i=0;i<ids.length;i++) //배열(인덱스) => collection
		{
			if(ids[i].equals(id)) // 검색
			{
				count++;
				index=i;
				break;
			}
		}
		
		if(count==0) //ID가 존재하지 않는다
		{
			System.out.println("ID가 존재하지 않는다");
		}
		else //ID가 존재
		{ //비밀번호 체크
			if(pwds[index].equals(pwd))
			{  //로그인 체크
				System.out.println(names[index]+"님 로그인 되었습니다");
			}
			else 
			{
				//비밀번호체크
				System.out.println("비밀번호가 틀렸습니다");
			}
		
		
		}
	}

}
