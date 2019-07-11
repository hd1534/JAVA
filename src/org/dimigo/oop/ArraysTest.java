package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        // 배열 출력
        String[] src = {"서울", "광주", "대구", "울산"};
        System.out.println(Arrays.toString(src));

        // 배열 복사
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        // 배열 비교
        System.out.println(src == dest); // FALSE
        System.out.println(Arrays.equals(src, dest)); // TRUE

        // 배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        // 배열 비교
        System.out.println(Arrays.equals(src, dest)); // FALSE ( 순서도 확인한다)

        // 배열 검색
        System.out.println(Arrays.binarySearch(dest, "울산"));  // 정렬을 하고 할것
    }
}
