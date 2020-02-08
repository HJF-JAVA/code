package main.java;

/**
 * create by 柘木
 * 2018.12.18.1.04
 * 翻转字符串
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {        //最中间的不用交换
            swap(ch, i, j);    //调用交换方法
            i++;
            j--;
        }

        return new String(ch);

    }

    public void swap(char[] ch, int i, int j) {
        char temp = ch[i];      //声明第三变量，进行交换
        ch[i] = ch[j];
        ch[j] = temp;
    }


}
