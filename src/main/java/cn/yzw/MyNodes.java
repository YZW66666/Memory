package cn.yzw;

//MyNode
public class MyNodes {
    private int data;//元素的值
    private MyNodes next;//下一个元素

    public MyNodes(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        //创建
        MyNodes node = new MyNodes(10);
        node.append(new MyNodes(20));
        node.append(new MyNodes(21));
        node.append(new MyNodes(22));
        node.append(new MyNodes(23));
        node.add(new MyNodes(19));
        node.show();
    }

    private void show() {
        MyNodes node =this;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    private void add(MyNodes myNode) {
        myNode.next=next;
        next=myNode;
    }

    private void append(MyNodes myNode) {
        MyNodes node = this;
        while (node.next != null) {
            System.out.println(node.data);
            System.out.println(node.next);
            node = node.next;
        }
        node.next = myNode;
    }
}
