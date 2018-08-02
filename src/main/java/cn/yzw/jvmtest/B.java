package cn.yzw.jvmtest;

import javax.sound.midi.Soundbank;

public class B extends A {
    final  static int FinNumB= 777;


    static int NumB=666;


    public B() {
        System.out.println("我是B的构造" );
    }


    static {
        System.out.println("我是B的静态代码块");
    }


    public static void main(String[] args) {
              new B();

           // System.out.println(B.NumB);
          //System.out.println(A.FinNumA);
         //System.out.println(A.NumA);
    }


}
