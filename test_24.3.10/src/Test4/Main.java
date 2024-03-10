package Test4;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: Test4
 * Description:OR46 字符集合
 *
 * @Author 行空XKong
 * @Create 2024/3/10 22:37
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println(new Solution().CharSet(str));
        }
    }
}

class Solution {
    public String CharSet(String str) {
        int[] count = new int[127];//记录字符是否出现过
        StringBuilder sb = new StringBuilder();
        //遍历
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //没出现过就在sb后追加字符串，并改变count中的状态
            if (count[ch] == 0) {
                sb.append(ch);
                count[ch] = 1;
            }
        }
        return sb.toString();
    }
}
