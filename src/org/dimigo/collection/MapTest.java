package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // 2. Map 개열 : HashMap
        // key, value 쌍으로 구성
        Map<String, Integer> map = new HashMap<>();
        map.put("국어", 100);
        map.put("영어", 90);
        map.put("수학", 80);
        mapprint(map);

        map.put("수학", 100);
        mapprint(map);

        System.out.println(map.get("sci"));

        map.remove("영어");
        mapprint(map);

        System.out.println(map.values());
        System.out.println(map.containsValue(100));
        System.out.println(map.containsValue(1));


        // Map : key(String), values : List<String>
        Map<String, List<String>> map2 = new HashMap<>();

        // List : Map<String, String>
        List<Map<String, String>> list = new ArrayList<>();
    }

    private static void mapprint(Map<String, Integer> map) {
        for (String key : map.keySet())
            System.out.print(key + " : " + map.get(key) + " | ");
        System.out.println();
    }
}
