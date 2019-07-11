package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int [][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][1] = 100;
        intArr[1][2] = 90;
        printArray(intArr);


        String [][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];

        strArr[0][0] = "C";
        strArr[0][1] = "C++";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "PHP";
        strArr[1][1] = "c#";
        printArray(strArr);

        String[][] strArr2 = {
                {"C", "C++", "JAVA"},
                {"PHP", "c#"}
        };
        printArray(strArr2);

        String[][] strArr3 = {
                new String[] {"C", "C++", "JAVA"},
                new String[] {"PHP", "c#"}
        };
        printArray(strArr3);

        String[][] strArr4 = {
                new String[] {new String("C"), new String("C++"), new String("JAVA")},
                new String[] {new String("PHP"), new String("c#")}
        };
        printArray(strArr4);
    }

    private static void printArray(int[][] intArr){
        for (int[] values: intArr) {
            for (int value : values)
                System.out.printf("%3d | ", value);
            System.out.println();
        }

        for (int i = 0; i < intArr.length; i++)
            for (int j = 0; j < intArr[i].length; j++)
                System.out.println("intArr[" + i + "][" + j + "] : " + intArr[i][j]);
        System.out.println("_____________________");
    }

    private static void printArray(String[][] strArr){
        for (String[] values: strArr) {
            for (String value : values)
                System.out.printf("%4s | ", value);
            System.out.println();
        }

        for (int i = 0; i < strArr.length; i++)
            for (int j = 0; j < strArr[i].length; j++)
                System.out.println("strArr[" + i + "][" + j + "] : " + strArr[i][j]);
        System.out.println("_____________________");
    }
}
