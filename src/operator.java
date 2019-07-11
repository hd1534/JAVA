import java.lang.reflect.Type;

public class operator {
    public static void main(String[] args) {
        // 1. 산술 연산자
        int a = 5, b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/(double)b);
        System.out.println(a%b);


        int i = 10;
        double d = 3.14;
        int r1 = (int)(i + d);
        double r2 = i + d;

        short s1 =1, s2 =2;
        //s1 = s1 + s2;  // int보다 작은 타입의 연산의 결과는 int로 된다.
        short r3 = (short)(s1 + s2);
        int r4 = s1 + s2;

    }
}
