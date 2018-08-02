package cn.yzw;

import java.text.Collator;
import java.util.*;

public class HasSet {
    @SuppressWarnings("rawtypes")
    private  final  static Comparator CHINA_COMPARE= Collator.getInstance(Locale.CHINA);
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("abc");
        set.add(new String("abc"));
        set.add(new String("abc"));
        System.out.println(set.size());

        List<String> list = Arrays.asList("张三","李四","王五");
        Collections.sort(list,CHINA_COMPARE);
        for (String str :list){

            System.out.println(str);

        }
    }
}
