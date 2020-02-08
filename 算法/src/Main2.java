package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 柘木
 * @date 2019-12-29
 */
public class Main2 {

    public static void main(String[] args) {
        Integer sumA = 0;
        Integer sumB = 0;
        Integer[] a = new Integer[4];
        Integer[] b = new Integer[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < 4; j++) {
            b[j] = sc.nextInt();
        }
        HashMap<Integer, Integer> trueHashMap = new HashMap<>();
        HashMap<Integer, Integer> guseHashMap = new HashMap<>();
        for (int k = 0; k < 4; k++) {
            trueHashMap.put(a[k], k);
        }
        for (int v = 0; v < 4; v++) {
            guseHashMap.put(b[v], v);
        }

        for (Map.Entry<Integer, Integer> trueValue : trueHashMap.entrySet()) {
            for (Map.Entry<Integer, Integer> guseValue : guseHashMap.entrySet()) {
                if (trueValue.getKey() == guseValue.getKey() && trueValue.getValue() == guseValue.getValue()) { //A条件
                    sumA++;
                    break;
                } else if (trueValue.getKey() == guseValue.getKey() && trueValue.getValue() != guseValue.getValue()) {  //B条件
                    sumB++;
                    break;
                }
            }
        }
        String s = sumA + "A" + sumB + "B";
        System.out.printf(s);

    }
}
