import java.util.Scanner;

/**
 * ClassName: Test6
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 21:02
 * @Version 1.0
 */
//JAVA14 判断质数
public class Test6 {
    public static void main(String[] args) {
        Test6 main = new Test6();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(main.isPrimeNumber(number));
    }

    public Boolean isPrimeNumber(int number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
