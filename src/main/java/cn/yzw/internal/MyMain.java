package cn.yzw.internal;

public class MyMain {
    public static void main(String[] args) {

        Father father=new Father();

        Father.Son son =father.new Son();

        System.out.println(son.name);

        son.hellow();


        father.test();

        Father.staticSon1 son1 =new Father.staticSon1();

        son1.StaticHellow();

        Animal cat=new Animal() {


            @Override
            public void eat() {
                System.out.println("猫吃鱼,狗吃肉,奥特曼打小怪兽");
            }


            @Override
            public void sleep() {
            }


        };
        cat.eat();
    }

}
