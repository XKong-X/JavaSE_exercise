import java.util.Scanner;

/**
 * ClassName: Test7
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 21:19
 * @Version 1.0
 */
//JAVA15 计算整数位数
public class Test7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        if (num <= 0) {
            System.out.println(num);
            return;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
