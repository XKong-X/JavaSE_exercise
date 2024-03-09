package Test3;

/**
 * ClassName: Main
 * Package: Test3
 * Description:125. 验证回文串
 *
 * @Author 行空XKong
 * @Create 2024/3/10 2:04
 * @Version 1.0
 */
class Solution {
    private boolean isAlpNumChar(char ch) {
        if ((ch >= 'a') && (ch <= 'z') || (ch >= '0') && (ch <= '9')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();//统一成小写
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !isAlpNumChar(s.charAt(l))) {
                l++;
            }
            while (l < r && !isAlpNumChar(s.charAt(r))) {
                r--;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
