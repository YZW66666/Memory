package cn.yzw.algorithm;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("找零五十");
        int MONEY = 500; //统一单位
        for (int a = 0; a <= 500 / 50; a++) {//5元出现的次数
            for (int b = 0; b <= 80 / 20; b++) {//2元出现的次数
                for (int c = 0; c <= 80 / 5; c++) {//5毛出现的次数
                    if ((80 - (a * 50 + b * 20 + c * 10)) < 0) break;   //剪枝操作  减少计算机的计算次数
                    int d = (80 - (a * 50 + b * 20 + c * 10)) / 5;//5角出现的次数
                    if (a * 50 + b * 20 + c * 10 + d * 5 == 80) {
                        System.out.println("5元数量：" + a + "===>" + "2元数量：" + b + "1元数量：" + c + "5角数量：" + d);
                    }
                }
            }
        }



        System.out.println("鸡兔同笼");
        for (int i = 0; i <=50; i++) {
            int j=50-i;
            if (2*i+4*j==120){
                System.out.println("鸡"+i);
                System.out.println("兔"+j);
            }
        }


        System.out.println("数字自身平方的尾数-自身（100万以内）");
        for (int i = 0; i <1000000; i++) {
            //求i的平方
            int num=i*i;

            if (num%10==i||num%100==i||num%1000==i||num%10000==i||num%100000==i||num%1000000==i){

                System.out.println("自身为"+i+"平方为"+num);

            }

        }
    }




}

