package cn.yzw.jvmtest;

public class A {

    final  static int FinNumA= 777;

    static int NumA=666;


    public A() {
        System.out.println("我是A的构造" );
    }

    static {
        System.out.println("我是A的静态代码块");
    }

}
