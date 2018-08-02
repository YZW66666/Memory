package cn.yzw.single;

public class HungryDemo {

    private HungryDemo() {}

    //饿汉模式(先实例化)
    private static final HungryDemo  hungryDemo= new HungryDemo();

    public static synchronized HungryDemo getInstance() {

        return hungryDemo;

    }


}
