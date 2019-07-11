package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        uncheckedException(null);
        
        checkedException();

        validate("abc");
        validate(null);
    }

    // 컴파일러가 강제적으로 예외처리를 요구하지 않음
    private static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
            System.out.println(Integer.parseInt("123a"));
        }
        catch (NullPointerException npe) {
            // NullPointerException npe = new NullPointerException();
            System.out.println("NullPointer!");
            npe.printStackTrace();
        }
        catch (NumberFormatException nfe) {
            System.out.println("Check your NumberFormat");
        }
        catch (Exception e) {
            System.out.println("이건 뭐냐?");
        }
    }

    //컴파일러가 강제적으로 예외처리를 요구함.
    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt")
            );
            String str;
            while ( (str = br.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch (FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");
        }
        catch (IOException ie) {
            System.out.println("파일 읽기 오류");
        }

    }

    private static void validate(String id) { //예외를 나를 호출한곳으로 : throws Exception {
        try {
            if (id == null || "".equals(id)) {
                Exception e = new Exception("ID를 입력하세요");
                throw e;
            } else if (id.length() < 8) {
                throw new Exception("8자 이상 입력해라");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
