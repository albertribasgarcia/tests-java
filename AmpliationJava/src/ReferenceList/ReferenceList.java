package ReferenceList;

import java.util.ArrayList;
import java.util.List;

public class ReferenceList {
    public static void main(String[] args) {
        List<Integer> listIntegers = new ArrayList<>();
        List<String> listString = new ArrayList<>();
        Integer intClass = 5;
        int intPrimi = 2;

        testMethod(listIntegers, listString, intClass, intPrimi);

        for (int i = 0; i < listIntegers.size(); i++){
            System.out.println(listIntegers.get(i));
            System.out.println(listString.get(i));
        }
        System.out.println(intClass);
        System.out.println(intPrimi);

    }

    private static void testMethod(List<Integer> listI, List<String> listS, Integer intClass, int intPrimi){
        listI.add(1);
        listI.add(2);
        listI.add(3);
        listS.add("4");
        listS.add("5");
        listS.add("6");
        intClass = 0;
        intPrimi = 10000;
    }
}
