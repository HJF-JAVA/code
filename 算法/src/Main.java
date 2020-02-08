package main.java;

import java.util.Scanner;

/**
 * @author 柘木
 * @date 2020/1/16
 */
public class Main {
   static void judge(char[][] x, int r, int c) {
        int longer = x.length;
        int width = x[0].length;

        if (r < 0 || c < 0 || r >= longer || c >= width || x[r][c] == '0') {
            return;
        }

        x[r][c] = '0';
        judge(x, r - 1, c);
        judge(x, r + 1, c);
        judge(x, r, c - 1);
        judge(x, r, c + 1);
    }

    public static int judgeIsLand(char[][] x) {
        if (x == null || x.length == 0) {
            return 0;
        }
        int longer = x.length;
        int width = x[0].length;
        int num_Land = 0;
        for (int r = 0; r < longer; ++r) {
            for (int c = 0; c < width; ++c) {
                if (x[r][c] == '1') {
                    ++num_Land;
                    judge(x, r, c);
                }
            }
        }
        return num_Land;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        char[][] x = new char[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                char[] chars = sc.next().toCharArray();
                x[i][j] =chars[0];
            }
        }
        System.out.println(judgeIsLand(x));
    }
}
