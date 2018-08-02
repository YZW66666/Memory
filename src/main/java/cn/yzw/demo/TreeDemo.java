package cn.yzw.demo;

public class TreeDemo {
    private int data;  //树上的数据
    private TreeDemo left;//左树的元素
    private TreeDemo right;//左树的元素
    public TreeDemo(int data) {
        this.data = data;
    }
    public static void main(String[] args) {
        TreeDemo treeDemo = new TreeDemo(50);
        treeDemo.add(new TreeDemo(52));
        treeDemo.add(new TreeDemo(56));
        treeDemo.add(new TreeDemo(51));
        treeDemo.add(new TreeDemo(46));
        treeDemo.add(new TreeDemo(57));
        treeDemo.show();


    }

    private void show() {

        if (left!=null) left.show();
            System.out.println(data);
        if (right!=null) right.show();
    }
    private void add(TreeDemo treeDemo) {

        if (treeDemo.data < this.data) {
            if (left == null) {

                left = treeDemo;

            } else {
                left.add(treeDemo);
            }


        }else {

            if (right == null) {

                right = treeDemo;

            } else {
                right.add(treeDemo);
            }



        }


    }
}
