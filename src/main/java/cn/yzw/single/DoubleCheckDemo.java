package cn.yzw.single;

public class DoubleCheckDemo {
    //单例

    //双重检验锁
    private DoubleCheckDemo() {}
    private static  DoubleCheckDemo doubleCheckDemo = null;
    public static synchronized DoubleCheckDemo getInstance(){
        if(doubleCheckDemo == null){
            synchronized(DoubleCheckDemo.class) {
                if(doubleCheckDemo == null) {
                    doubleCheckDemo = new DoubleCheckDemo();
                }
            }
        }
        return doubleCheckDemo;
    }

}
