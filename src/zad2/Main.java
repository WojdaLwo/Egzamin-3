package zad2;

import java.util.HashMap;
import java.util.Map;

//Zad 02:
//        Dany jest kod:
//        Map<String, ??> operationMap = new HashMap()<>();
//        operationMap.put("+", ??);
//        operationMap.put("-", ??);
//        operationMap.put("*", ??);
//        operationMap.put("/", ??);
//
//        System.out.println(operationMap.get("+").calculate(10,20));
//
//        zrob aby kod dzialal.

public class Main {
    public static void main(String[] args) {
        Map<String, TwoNumberOperation> operationMap = new HashMap<>();
        operationMap.put("+", (d1, d2) -> d1 + d2);
        operationMap.put("-", (d1, d2) -> d1 - d2);
        operationMap.put("*", (d1, d2) -> d1 * d2);
        operationMap.put("/", (d1, d2) -> d1 / d2);

        System.out.println(operationMap.get("+").calculate(10, 20));
        System.out.println(operationMap.get("-").calculate(10, 20));
        System.out.println(operationMap.get("*").calculate(10, 20));
        System.out.println(operationMap.get("/").calculate(10, 20));
    }
}
