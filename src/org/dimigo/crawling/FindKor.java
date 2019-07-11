package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FindKor {
    public static void main(String[] args) throws Exception{
        find("안녕");
    }
    public static void find(String word) throws Exception {
        Document doc = Jsoup.connect("https://stdict.korean.go.kr/search/searchResult.do?pageSize=10&searchKeyword=" + word).get();
        if (doc.html().contains("에 대한 검색 결과가 없습니다.")) {
            System.out.println("없는데?");
        }
        else {
            System.out.println("있네");
        }
    }
}
