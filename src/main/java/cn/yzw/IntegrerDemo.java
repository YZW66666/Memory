package cn.yzw;

public class IntegrerDemo {
    public static void main(String[] args) {
        {
            Integer num1=1;
            Integer num2=1;
            Integer num3=200;
            Integer num4=200;
            System.out.println("num1==num2 "+(num1==num2));
            System.out.println("num1.equals(num2)"+num1.equals(num2));
            System.out.println("num1==num2 ?"+(num3==num4));
            System.out.println("num3.equals(num4)"+num3.equals(num4));
        }
    }
}
