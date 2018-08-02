package cn.yzw.algorithm;

public class DemoString {
    public static void main(String[] args) {

        System.out.println("一刀切(事先补齐)");
        String  a="ab bc,cd,ef gh";

        String result="";//保存结果

        for (int i = 0; i < a.length(); i++) {
            char num=a.charAt(i);//获取每一个字符


        }


















        String s="a,b,c,d,e,f,g,h";  //abcdef
        String y="a,b c d,e,f,g,h";  //abcdef

       String [] c=a.split(",");

        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]);
        }


        for (int i = 0; i <a.length() ; i++) {

        }
        String b ="abcdef";         //a,b,c,d,e,f

        String d ="a  b c d e f";
        String replace = d.replace(" ", ",");
        System.out.print("\n"+replace);
        System.out.println("\nend");
    }
}
