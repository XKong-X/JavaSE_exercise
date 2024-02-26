import java.util.Scanner;

/**
 * ClassName: Test4
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 22:17
 * @Version 1.0
 */
//JAVA4 交换变量值
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a+" "+b);
    }
}
