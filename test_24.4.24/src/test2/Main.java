package test2;

/**
 * ClassName: Main
 * Package: test2
 * Description:编写程序，对输入的年、月、日，给出该天是该年的第多少天（要考虑闰年的情况）
 *
 * @Author 行空XKong
 * @Create 2024/4/24 18:53
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int year = 2024;
        int month = 3;
        int day = 10;
        System.out.println("是该年的第" + isDays(year, month, day) + "天");
    }

    //计算天数
    private static int isDays(int year, int month, int day) {
        int[] m = {0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 1; i <= month; ++i) {
            day += m[i];
            if (isLeapYear(year) && i == 3) {
                ++day;
            }
        }
        return day;
    }

    //判断闰年
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}