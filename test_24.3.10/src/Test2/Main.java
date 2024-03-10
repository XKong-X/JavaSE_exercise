package Test2;

/**
 * ClassName: Main
 * Package: Test2
 * Description:434. 字符串中的单词数
 *
 * @Author 行空XKong
 * @Create 2024/3/10 15:38
 * @Version 1.0
 */
class Solution {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                ++count;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().countSegments(" "));
    }
}