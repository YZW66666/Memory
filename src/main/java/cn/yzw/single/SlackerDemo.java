package cn.yzw.single;

public class SlackerDemo {
    //懒汉模式(使用的时候在new)
    private SlackerDemo() {}
    private static SlackerDemo slackerDemo = null;
    public static SlackerDemo getInstance(){
        if(slackerDemo == null){
            slackerDemo = new SlackerDemo();
        }
        return slackerDemo;
    }
}
