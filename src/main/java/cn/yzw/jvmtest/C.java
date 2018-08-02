package cn.yzw.jvmtest;

public class C extends B {


    public C() {
        System.out.println("我是C的构造" );
    }


    static {
        System.out.println("我是C的静态代码块");
    }


    public static void main(String[] args) {
        System.out.println(B.FinNumB);
    }


}
