package Test1;

/**
 * ClassName: test1
 * Package: Test1
 * Description:387. 字符串中的第一个唯一字符
 *
 * @Author 行空XKong
 * @Create 2024/3/9 20:13
 * @Version 1.0
 */
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 97]++;
        }
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}

public class test1 {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
    }
}
