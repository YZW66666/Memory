package cn.yzw;

public  class SatticDemo {


    public static void main(String[] args) {
        String num1="abc";
        String num2="a";
        String num3="bc";
        String num4=num2+num3;
        String num5="abc";
        System.out.println("num1=num3 ?"+(num1==num4));
        System.out.println("num1=num3 ?"+(num1==num4.intern()));

        System.out.println("num1=num5 ?"+(num1==num5));
        System.out.println("==========final===========");
        String  numa="abc";
        final String numb="a";
        final String  numc="bc";
        final String  numd=numb+numc;
        final String  nume="abc";
        System.out.println("numa=numd ?"+(numa==numd));
        System.out.println("numa=nume ?"+(numa==nume));
    }
}
