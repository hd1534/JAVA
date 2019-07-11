package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class crawlingTest {
    public static void main(String[] args) {
        // 네이버 웹툰
        try {
            // html 긁기
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            // System.out.println(doc.html());

            // 원하는거 찾기
            Elements result = doc.select("[id=realTimeRankFavorite] li a");
            System.out.println(result);

            // 결과만 보기
            List<String> list = result.eachText();
            for(String title : list) {
                System.out.println(title);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
