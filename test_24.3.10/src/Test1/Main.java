package Test1;

/**
 * ClassName: Main
 * Package: Test1
 * Description:709. 转换成小写字母
 *
 * @Author 行空XKong
 * @Create 2024/3/10 14:43
 * @Version 1.0
 */
class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch |= 32;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().toLowerCase("Hello"));
    }
}
