/**
 * ClassName: Test1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 19:47
 * @Version 1.0
 */
//JAVA9 数列求和
public class Test1 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            long tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp = tmp * 10 + 9;
            }
            sum += tmp;
        }
        System.out.println(sum);
    }
}
