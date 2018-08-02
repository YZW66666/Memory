package cn.yzw.demo;

//MyNode
public class MyNode {
    private int data;//元素的值
    private MyNode next;//下一个元素

    public MyNode(int data) {
        data = data;
    }

    public static void main(String[] args) {
        //创建
        MyNode node = new MyNode(10);
        node.append(new MyNode(20));
        node.append(new MyNode(21));
        node.append(new MyNode(22));
        node.append(new MyNode(23));
        node.add(new MyNode(19));
        node.show();
    }

    private void show() {
        MyNode node =this;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;

        }
    }

    private void add(MyNode myNode) {
        myNode.next=next;
        next=myNode;
    }

    private void append(MyNode myNode) {
        MyNode node = this;
        while (node.next != null) {
            System.out.println(node.data);
            System.out.println(node.next);
            node = node.next;
        }
        node.next = myNode;
    }
}
