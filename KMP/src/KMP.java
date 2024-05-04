import sun.security.util.Length;

/**
 * ClassName: KMP
 * Package: PACKAGE_NAME
 * Description:字符串匹配算法之KMP算法（时间复杂度O(m + n)）
 *
 * @Author 行空XKong
 * @Create 2024/5/4 0:13
 * @Version 1.0
 */
public class KMP {
    public static int KMP(String str, String sub, int pos) {
        if (str == null || sub == null) {
            return -1;
        }
        int lenStr = str.length();
        int lenSub = sub.length();
        if (lenStr == 0 || lenSub == 0 || pos < 0 || pos >= lenSub) {
            return -1;
        }

        int[] next = new int[lenSub];
        int[] nextVal = new int[next.length];
        getNext(sub,next);
        getNextVal(sub, next, nextVal);

        int i = pos;//主串起始下标
        int j = 0;

        while (i < lenStr && j < lenSub) {
            if (j == -1 || str.charAt(i) == sub.charAt(j)) {
                ++i;
                ++j;
            } else {
                j = nextVal[j];
            }
        }
        if (j >= lenSub) {
            return i - j;
        }
        return -1;
    }

    private static void getNext(String sub, int[] next) {
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int k = 0;
        int len = sub.length();
        while (i < len) {
            if (k == -1 || sub.charAt(i - 1) == sub.charAt(k)) {
                next[i] = k + 1;
                ++k;
                ++i;
            } else {
                k = next[k];
            }
        }
    }

    private static void getNextVal(String sub, int[] next, int[] nextVal) {
        nextVal[0] = -1;
        int i = 1;
        int k = 0;
        int len = next.length;
        while (i < len) {
            if (sub.charAt(i) == sub.charAt(k)) {
                nextVal[i] = nextVal[k];
            } else {
                nextVal[i] = next[i];
            }
            ++k;//也可以在每次不相等的时候 k = i
            ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println(KMP("ababcabcdabcdeabcdef", "aabcaaaab", 0));
        System.out.println(KMP("ababcabcdabcdeabcdef", "abcd", 0));
        System.out.println(KMP("ababcabcdabcdeabcdef", "abcdf", 0));
        System.out.println(KMP("ababcabcdabcdeabcdef", "abc", 0));
        System.out.println(KMP("ababcabcdabcdeabcdef", "abca", 2));
        System.out.println(KMP("ababcabcdabcdeabcdef", "dab", 0));
        System.out.println(KMP("ababcabcdabcdeabcdef", "bcdef", 0));
        System.out.println(KMP("ababcabcdabcdeabcdef", "bcdab", 0));
    }
}
