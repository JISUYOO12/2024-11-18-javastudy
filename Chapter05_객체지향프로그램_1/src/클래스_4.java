// 사용자 정의 데이터
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Recipe2
{
	int rno; // 구분자
	String title;
	String chef;
	String poster;
}


class RecipeSite
{
	static Recipe[] recipes=new Recipe[40];
	// 사용자 정의 데이터는 일반 데이터형과 사용하는 방법 유사
    // 시작과 동시에 recipes의 초기화
	private Object ul;
	static // 초기화 블록
	{
		try
		{	
			int j=0;
			Document doc=Jsoup.connect("https://www.10000recipe.com/profile/recipe.html?uid=59304070").get();
			Elements title=doc.select("ul.common_sp_caption_tit line2");
			Elements chef=doc.select("ul.common_sp_caption_rv_name");
			for(int i=0;i<title.size();i++)
			{	recipes[j]=new Recipe();
				// 메모리 할당
				recipes[j].title=title.get(i).text();
				recipes[j].chef=title.get(i).text();
				j++;
				//System.out.println(title.get(i).text());
				//System.out.println(chef.get(i).text());
			}
			
		}catch(Exception ex) {}
	}
}
public class 클래스_4 {
	// 사용자가 볼 수 있는 위치 => main => 브라우저
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecipeSite rs=new RecipeSite();
		System.out.println("====레시피 목록=====");
		for(Recipe r:rs.recipes)
		{
			System.out.println(r.title);
		}
		
	}

}
