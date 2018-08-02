package cn.yzw.algorithm;
public class DemoString2 {
    public static void main(String[] args) {
        System.out.println("abcdefg>>>>a,b,c,d,e,f,g");
        String  str1="abcdefg"; //结果a,b,c,d,e,f,g
        String result="";
        for(int i=0;i<str1.length();i++){
            result+=","+str1.charAt(i);//获取每一个字符
            //,a,b,c,d,e,f,g
        }
        result=result.substring(1);
        System.out.println(result);
        String  str2="abcdefgabcd";  //求字符串中是否有重复的字符
        boolean flag=false; // 假设不重复
        for(int i=0;i<str2.length();i++){
            char c=str2.charAt(i);//获取每一个字符
            if(str2.lastIndexOf(c)!=i){
                flag=true; //重复
                System.out.println("重复");
                break;
            }
            System.out.println("不重复");
        }
        //字符串的常用API  （正则表达式）replaceAll()
        //在小括号里面的内容我们称之为子组，用$获取子组内容
        String  str3="asasasa 2018-07-16 sasa sasas sasa";
      //实现的效果是asasasa 07/16/2018年 sasa sasas sasa
        str3=str3.replaceAll("([0-9]{4})-([0-9]{2})-([0-9]{2})","$2/$3/$1 年");
        System.out.print(str3);
        String a="ABC01234";
        a.matches("[A-Z]{1,3}[0-9]{3,5}"); //返回boolean
    }
}