package day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.xml.sax.helpers.ParserAdapter;

public class URL1 {

	public static void main(String[] args) {
		Crawling cl = new Crawling();
		cl.wabReader("https://movie.naver.com/");

	}

}
class Crawling{
	URL url;							//URL 클래스로 웹에 있는 문자열을 읽어올 수 있음.(공공데이터 가져오기 등)
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	private String str = null;
	public void wabReader(String address) {
		try {
			url = new URL(address);
			is = url.openStream(); 
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
				if(str.contains("class=\"blind\"") && str.contains("<li class=\"ranking")) {
					String parse = "";
					parse = str.substring(str.indexOf("title=")+7, str.indexOf("><span")-1);
							parserArray.add(parse);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
	}
}
