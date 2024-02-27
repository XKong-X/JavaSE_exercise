import java.util.Scanner;

/**
 * ClassName: Test5
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 20:45
 * @Version 1.0
 */
//JAVA13 求平均数
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        double sum = 0.0;
        int count = 0;
        while (in.hasNextInt()) {
            if ((n = in.nextInt()) <= 0) {
                break;
            }
            sum += n;
            count++;
        }
        System.out.println(String.format("%.2f",sum / count));
    }
}
