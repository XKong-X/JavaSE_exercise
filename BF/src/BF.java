/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:字符串匹配算法之BF算法（时间复杂度O(m * n)）
 *
 * @Author 行空XKong
 * @Create 2024/4/29 11:59
 * @Version 1.0
 */
public class BF {
    public static int BF(String str, String sub) {
        if (str == null || sub == null) {
            return -1;
        }
        if (str.length() == 0 || sub.length() == 0) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int lenStr = str.length();
        int lenSub = sub.length();

        int prev = i;
        while (i < lenStr && j < lenSub) {
            char ch1 = str.charAt(i);
            char ch2 = sub.charAt(j);
            if (ch1 == ch2) {
                ++i;
                ++j;
            } else {
                i = ++prev;
                j = 0;
            }
        }

        if (j == lenSub) {
            return prev;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int n = BF("dfbcabfghgfh", "");
        System.out.println(n);
    }
}
