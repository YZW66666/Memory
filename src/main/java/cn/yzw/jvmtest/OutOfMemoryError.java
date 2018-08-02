package cn.yzw.jvmtest;

public class OutOfMemoryError {
    public static void  A(){
        B();
    }
    public static void  B(){
        A();
    }
    public static void main(String[] args) {
     A();
    }
}
