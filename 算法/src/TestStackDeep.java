package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author 柘木
 * @date 2019-11-30
 */
public class TestStackDeep {
    private static int count = 0;

    public static void recursion(long a, long b, long c) {
        long e = 1, f = 2, g = 3, y = 4, u = 5, i = 6, o = 7, p = 8, q = 9, w = 10;
//        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        objectObjectHashMap=null;
        System.gc();
        System.out.println("执行完gc" + count);
        count++;
        recursion(a, b, c);
    }

    public static void recursion() {
        ArrayList arrayList = new ArrayList<Integer>(6*1024*1024*1024*1024*1024);
//        arrayList = null;
//        System.gc();
//        System.out.println("arrayList:"+arrayList.toString());
//        count++;
//        recursion();
    }

    public static void main(String[] args) {
        try {
//            recursion(0l, 0l, 0l);
            for (double j = 0; j < 1000000000000000000.0; j++) {
                recursion();
            }
        } catch (Throwable e) {
            System.out.println("deep of calling=" + count);
            e.printStackTrace();
        }
    }
}
