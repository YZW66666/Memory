package cn.yzw;
public class App 
{
    public static void main( String[] args )
    {
        //=======================================
        //=======666666666666666666666666666666666666666==========
        //二维数组
        int [][] grade = new int[2][3];
        grade[0][0]=1;
        grade[0][1]=2;
        grade[0][2]=3;
        grade[1][0]=4;
        grade[1][2]=5;
        grade[1][2]=6;
        for (int i=0;i<grade.length;i++){
        for (int j=0;j<grade[i].length;j++){
            System.out.println(grade[i][j]);
        }
    }
        Integer a=128;
        Integer b=128;
        System.out.println(a==b);
        int  num1=128;
        int  num2=128;
        System.out.println(a==b);
        //存放的是电话号码包含的数字
        int [] num={9,8,5,7,1,0,4,3};
        //电话号码出现的下标
        int [] index={4,2,3,2,7,5,6,0,0,0,1};
        // 求电话号码 15753049998
        for (int i=0;i<index.length;i++){
            System.out.print(num[index[i]]);
        }
    }
}


