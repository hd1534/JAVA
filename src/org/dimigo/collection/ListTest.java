package org.dimigo.collection;


import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 1. List 계열 : ArrayList
        List list = new ArrayList();
        list.add("홍길동");
        list.add(100);
        list.add(new Dog("멍멍이"));

        String s = (String) list.get(0);


        // 제네릭(Generic)
        List<String> list2 = new ArrayList<>();
        list2.add("사과");
        list2.add("배");
        list2.add("딸기");
        list2.add("딸기");
        list2.add("딸기");
        printList(list2);

        list2.add(1,"포도");
        printList(list2);

        list2.set(4, "바나나");
        printList(list2);

        System.out.print(list2.get(0) + " | ");
        System.out.println(list2.get(list2.size() - 1));

        list2.remove(0);
        printList(list2);

        list2.remove("딸기");
        printList(list2);

        list2.clear();
        System.out.println("clear is done!");
        printList(list2);
        System.out.println("print is  done!");
    }

    private static void printList(List<String> list) {
        for (String value : list) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

}
