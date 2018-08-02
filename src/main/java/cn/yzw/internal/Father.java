package cn.yzw.internal;

public class Father {
    static  String Name="yzw";
    //成员部类
    // 如果想要访问内部类，必须有外部类
    // 通过外部类访问内部类
    //每个内部类都有一个对外部类的应用
    //所有的内部类都有一个标识指向外部类
    // =========================================================================================





















    //成员内部类
    public class Son {
        String name = "成员内部类属性";

        public void hellow() {
            System.out.println("成员内部类方法");
        }
    }
    //局部内部李
    public void test() {
        //局部内部类
        // 类被定义在一个方法体或者代码块中
        //类上不允许加访问修饰符
        class Son1 {
            String name2 = "局部内部类属性";

        }
        Son1 son1 =new Son1();
        System.out.println(son1.name2);
    }
    //公有的静态内部类
    public static class staticSon1{
        public void StaticHellow(){
            System.out.println("静态内部类方法");
            System.out.println("外部类静态属性"+Name);
        }
    }
    //私有的静态内部类
    private static class staticSon2{

    }





}
