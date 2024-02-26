import java.util.Scanner;

/**
 * ClassName: Test6
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 22:38
 * @Version 1.0
 */
//JAVA6 判断体重指数
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        if (weight / (height * height) < 18.5) {
            System.out.print("偏瘦");
        } else if (weight / (height * height) < 20.9) {
            System.out.print("苗条");
        } else if (weight / (height * height) <= 24.9) {
            System.out.print("适中");
        } else {
            System.out.print("偏胖");
        }
    }
}
