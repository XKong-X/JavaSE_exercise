import java.util.Scanner;

/**
 * ClassName: Test2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 22:10
 * @Version 1.0
 */
//JAVA2 简单运算
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        System.out.println((a+b) + " "+(a-b) + " "+(a*b) + " "+(a/b) + " "+(a%b));
    }
}
