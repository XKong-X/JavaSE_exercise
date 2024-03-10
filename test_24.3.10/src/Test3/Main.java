package Test3;

/**
 * ClassName: Main
 * Package: Test3
 * Description:415. 字符串相加
 *
 * @Author 行空XKong
 * @Create 2024/3/10 16:43
 * @Version 1.0
 */
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int add = 0;//用于记录进位的大小
        //求和
        while (len1 >= 0 || len2 >= 0 || add != 0) {
            int x = (len1 >= 0) ? (num1.charAt(len1) - '0') : 0;
            int y = (len2 >= 0) ? (num2.charAt(len2) - '0') : 0;
            int res = x + y + add;//当前字符相加结果
            sb.append(res % 10);//往尾部追加字符串
            add = res / 10;
            len1--;
            len2--;
        }
        sb.reverse();//转置字符串
        return sb.toString();//把StringBuilder类转变为String类后返回
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("12356454564465456", "235645645645646545646"));
    }
}
