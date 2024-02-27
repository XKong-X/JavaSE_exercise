import java.util.Scanner;

/**
 * ClassName: Test2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 19:54
 * @Version 1.0
 */
//JAVA10 统计输入正数个数
public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n <= 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
