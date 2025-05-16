package Selenium;

import java.util.ArrayList;
import java.util.List;

public class List_Concept {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");
        list.remove("one");
        String value = list.get(2);
        System.out.println("check the value");
        boolean bool = list.contains("three");
        System.out.println("++"+bool);
        boolean ok= list.isEmpty();

        System.out.println(ok);

        int count = list.size();
        System.out.println(count);

        for (String val: list) {
            System.out.println(val);
        }



    }
}
