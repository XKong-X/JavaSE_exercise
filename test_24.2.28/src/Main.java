import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/28 17:37
 * @Version 1.0
 */
//7-26 单词长度
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] c = str.toCharArray();
        while (true) {
            //最后一个字符不为'.'时，直接打印数组长度，否则打印数组长度-1(去掉'.')并结束
            if (c[c.length - 1] != '.') {
                System.out.print(c.length);
            } else {
                if (c.length != 1) {
                    System.out.print(c.length - 1);
                }
                return;
            }
            //重新读
            str = in.next();
            c = str.toCharArray();
            //第一个字符不为'.'时打印' ',否则结束
            if (c[0] != '.') {
                System.out.print(" ");
            } else {
                return;
            }
        }
    }
}
