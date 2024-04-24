package test1;

/**
 * ClassName: Main
 * Package: test1
 * Description:编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
 *
 * @Author 行空XKong
 * @Create 2024/4/24 17:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        char ch = 'i';
        System.out.println(ch);
        System.out.println(toUpperCase(ch));
    }

    private static char toUpperCase (char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch ^= 32;
        }
        return ch;
    }
}