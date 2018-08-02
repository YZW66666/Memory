package cn.yzw.algorithm;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        System.out.println("字符串和数字的转换");
        System.out.println("输入你要转换的字符串");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + str.charAt(i) - '0';
        }
        System.out.println("转为int类型" + result);


        System.out.println("进制之间的转换");
        String num = "4012001"; // 5进制的数字转换成6进制的
        int result2 = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            result2 = result2 * 4 + (c - '0');
        }
        System.out.println(result2);  //十进制  13457

        System.out.println("5进制转6进制");

        String str2 = "";
        while (true) {
            if (result2 == 0) break;
            str2 += result2 % 6;
            result2 = result2 / 6;
        }
        System.out.println(str2);

    }
}
