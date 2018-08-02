package cn.yzw.jvmtest;

public class TE
{
    private  String name;
    public TE(){
        name="小明";
    }
    public TE(String name){
        this();
        System.out.println("大家好+"+this.name);
    }
    public static void main(String[] args) {
        TE te=new TE("小红");

    }
}
