package cn.yzw.single;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("====饿汉模式====");
        HungryDemo hungryDemo1=HungryDemo.getInstance();
        HungryDemo hungryDemo2=HungryDemo.getInstance();
        HungryDemo hungryDemo3=HungryDemo.getInstance();
        System.out.println(hungryDemo1==hungryDemo2);
        System.out.println(hungryDemo1==hungryDemo3);
        System.out.println("====懒汉模式====");
        SlackerDemo slackerDemo1=SlackerDemo.getInstance();
        SlackerDemo slackerDemo2=SlackerDemo.getInstance();
        SlackerDemo slackerDemo3=SlackerDemo.getInstance();
        System.out.println(slackerDemo1==slackerDemo2);
        System.out.println(slackerDemo1==slackerDemo3);
        System.out.println("双重校验锁");
        DoubleCheckDemo doubleCheckDemo1 =DoubleCheckDemo.getInstance();
        DoubleCheckDemo doubleCheckDemo2 =DoubleCheckDemo.getInstance();
        DoubleCheckDemo doubleCheckDemo3 =DoubleCheckDemo.getInstance();
        System.out.println(doubleCheckDemo1==doubleCheckDemo2);
        System.out.println(doubleCheckDemo1==doubleCheckDemo3);
    }
}
