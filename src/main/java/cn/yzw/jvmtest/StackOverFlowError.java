package cn.yzw.jvmtest;

public class StackOverFlowError {
    static  int a=1;
    public  static  void Num(){
        a++;
        Num();
    }
    public static void main(String[] args) {
    while (true){
        Num();
    }
    }
}
