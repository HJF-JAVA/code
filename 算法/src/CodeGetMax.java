package main.java;

/**
 * @author 柘木
 * @date 2020/1/24
 */
public class CodeGetMax {

    public static void main(String[] args) {
        int[] arr = {1,5,8,2,6,9,4,7,3,8,9,2,6};
        getMax(arr);
    }

    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    public static int process(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int mid = L + ((R - L) >> 1);
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);
    }
}
