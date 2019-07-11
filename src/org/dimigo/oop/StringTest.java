package org.dimigo.oop;

public class StringTest {
    // java string literal pool

    public static void main(String[] args) {
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        String dog3 = new String("멍멍이");
        String dog4 = new String("멍멍이");
        // 주소값 비교
        System.out.println(dog1 == dog2);
        System.out.println(dog1 == "멍멍이");
        System.out.println(dog2 == dog3);
        System.out.println(dog3 == dog4);
        System.out.println(dog3 == "멍멍이");

        // 문자열 비교
        String cat = "냥냥이";
        String str = null;

        System.out.println(dog1.equals(dog3));
        System.out.println(dog1.equals(cat));

        // if (str.equals("디미고"));  Null 포인팅 에러
        if (str != null && str.equals("디미고")); // 됨
        if ("디미고".equals(str)); // 됨


        String id = "aDmin";

        System.out.println(id != null && "admin".equals(id.toLowerCase())?"관리자입니다.":"외부인입니다.");
        System.out.println("admin".equalsIgnoreCase(id)?"관리자입니다.":"외부인입니다.");



    }
    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length());  // 14
        System.out.println(s.substring(3));  // defgABCDEFG
        System.out.println(s.substring(3, 6));  // defg
        System.out.println(s.indexOf('C'));  // C -> 9
        System.out.println(s.charAt(9));  //  9 -> C
        System.out.println(s.concat("ABC"));  // a~GABC
        System.out.println("             ABC      ".trim());  // ABC
        System.out.println(s.toUpperCase());  // 대문자로
        System.out.println(s.toLowerCase());  // 소문자로
        System.out.println(s.replace('a', 'A'));  // 'a' -> 'A'
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("dfg"));


    }
}
