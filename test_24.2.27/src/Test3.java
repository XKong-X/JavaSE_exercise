import java.util.Scanner;

/**
 * ClassName: Test3
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 20:02
 * @Version 1.0
 */
//JAVA11 求最小公倍数
public class Test3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n) {
        int product = m * n;
        while (n != 0) {
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return product / m;
    }
}
