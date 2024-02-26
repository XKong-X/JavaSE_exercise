import java.util.Scanner;

/**
 * ClassName: Test3
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 22:14
 * @Version 1.0
 */
//JAVA3 四舍五入
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();
        System.out.println((int)(d + 0.5));
    }
}
