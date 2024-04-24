package test3;

/**
 * ClassName: Main
 * Package: test3
 * Description:编程求 1~10000 之间的所有“完全数”，完全数是该数的所有因子之和等于该数的数。例如，6 的因子有 1、2、
 * 3，且 6=1+2+3，所以 6 是完全数
 *
 * @Author 行空XKong
 * @Create 2024/4/24 23:39
 * @Version 1.0
 */
public class Main {
    //    public static void main(String[] args) {
//        int num = 10000;
//        perfectNumber(num);
//    }
//
//    //打印完全数
//    private static void perfectNumber (int num) {
//        for (int i = 1; i <= num; ++i) {
//            int sum = 0;
//            for (int j = i / 2; j > 0; --j) {
//                if (i % j == 0) {
//                    sum += j;
//                }
//            }
//            if (sum == i) {
//                System.out.println(i);
//            }
//        }
//    }
    public static void main(String[] args) {
        int num = 10000;
        for (int i = 1; i <= num; ++i) {
            if (perfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    //判断完全数
    private static boolean perfectNumber(int i) {
        int sum = 0;
        for (int j = i / 2; j > 0; --j) {
            if (i % j == 0) {
                sum += j;
            }
        }
        return sum == i;
    }
}