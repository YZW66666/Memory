package cn.yzw;

public class StringDemo {
    public static void main(String[] args) {
        {
            String str1 = new String("123");
            String str2 = "123";
            System.out.println(str1==str2);

            System.out.println(str1.equals(str2));
            String num="adc";
            System.out.println(num);
            int[] nums= {0,1,2};
            System.out.println(nums[0]);
            Changenum(num);
            System.out.println(num);
            Changenums(nums);
            System.out.println(nums[0]);
        }

    }

    private static void Changenums(int[] nums) {
        nums[0]=1;
    }

    private static void Changenum(String num) {
        num ="cde";
    }
}
