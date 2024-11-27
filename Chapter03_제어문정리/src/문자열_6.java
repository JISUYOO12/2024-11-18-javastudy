/*
 * 문자 자르기
 * **** X 10000000
 * 중요!!!!!!!!!!!!
 * substring : 문자열을 자르기
 * | 지정된 위치부터 마지막까지 자르기
 * 	 Hello Java
 * 	 0123456789
 * 	substing(6) : 6번부터 맨 마지막까지 자르기 => Java
 * | 중간에서 자르기
 * 	substring(1,4) => ell
 * 			 -----endIndex-1
 * ------------------------------- JavaScript 동일
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data="Hello.Hello.java";
		// 			 0123456789101112131415
		//System.out.println(data.substring(data.lastIndexOf(".")+1));
		// 원본은 그대로 유지
		String data="ID:admin,PWD:1234";
		String id=data.substring(data.indexOf(":")+1,data.indexOf(",")); //;는 제외
		System.out.println(id);
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		System.out.println("data="+data);
		String address="서울 광진구 광장동 21 사파이어빌라[새주소] 서울 광진구 워커힐로 177 사파이어빌라";
		String addr1=address.substring(address.indexOf("["));
		System.out.println(addr1);
		String addr2=address.substring(address.indexOf("]")+2);
		System.out.println(addr2);
		System.out.println(addr2.trim());
		System.out.println(address);
		System.out.println();
		String s="Hello Java";
		String ss=s.substring(s.indexOf(" ")+1);
		//String ss=s.substing(s.ind)
		System.out.println(ss);
		//trim() => 좌우의 공백을 제거 
		
		

	}

}
