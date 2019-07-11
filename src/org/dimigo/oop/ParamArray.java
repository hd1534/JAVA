package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        chamgeName(names, "김");
        printArray(names);
    }

    private static void chamgeName(String[] names, String ch) {
        for (int i = 0; i < names.length; i++){
            // names[i] = names[i].replace('홍','김');
            names[i] = ch + names[i].substring(1);
        }
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void add(int[] intArr, int a){
        /*
        for(int value : intArr){
            value += i;
        }  // 이경우에는 value에 값을 불러와서 하기때문에 아무일 없다.
        */
        for(int i = 0; i < intArr.length; i++)
            intArr[i] += a;
    }
}
