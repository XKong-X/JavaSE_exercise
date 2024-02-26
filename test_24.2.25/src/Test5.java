import java.util.Scanner;

/**
 * ClassName: Test5
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 22:25
 * @Version 1.0
 */
//JAVA5 计算商场折扣
public class Test5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;
        if (price >= 5000) {
            cost = (int)(price * 0.6);
        } else if (price >= 2000) {
            cost = (int)(price * 0.7);
        } else if (price >= 500) {
            cost = (int)(price * 0.8);
        } else if (price >= 100) {
            cost = (int)(price * 0.9);
        } else {
            cost = price;
        }
        System.out.println(cost);
    }
}
