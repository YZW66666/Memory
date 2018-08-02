package cn.yzw.demo;


import java.util.ArrayList;
import java.util.List;
public class TreeDemo2 {
 
    //创建集合保存所有节点
    static  List<Node> list =new ArrayList<>();
    class Node{
        //节点
        String data;//值
        String parent;//父节点
    }
    public static void main(String[] args) {
        TreeDemo2 tree =new TreeDemo2();
        tree.add("北大青鸟","S1");
        tree.add("北大青鸟","S2");
        tree.add("北大青鸟","Y2");
        tree.add("S1","S1301");
        tree.add("S2","S2229");
        tree.add("Y2","Y2168");
        //根据子节点查询对应父节点
        showParent("S1301");
        //根据fu节点查询对应字节点
        showChild("S1");
    }

    private static List<String> showChild(String parent) {

//        for (int i = 0; i <list.size() ; i++) {
//            if (list.get(i).data.equals(parent)){
//                System.out.println(list.get(i).parent);
//        }

        List<String> children=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).parent.equals(parent)){
                children.add(list.get(i).data);
            }
        }
        return  children;


    }

    private static void showParent(String child) {
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).data.equals(child)){
                System.out.println(list.get(i).data);
            }

        }
    }


    private void add(String parent , String child) {
        Node node =new Node();
        node.data=child;
        node.parent=parent;
        //数据放入集合
        list.add(node);
    }
}
