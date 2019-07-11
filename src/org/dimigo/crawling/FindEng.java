package org.dimigo.crawling;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FindEng {
    public static void main(String[] args) throws Exception{
        find("hellow");
    }
    public static void find(String word) throws Exception{
        try {
            Document doc = Jsoup.connect("https://www.dictionary.com/browse/" + word + "?s=t").get();
            System.out.println("있네");
        }
        catch (HttpStatusException hse){
            System.out.println("없네");
        }
    }
}