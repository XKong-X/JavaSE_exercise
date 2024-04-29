package test2;

/**
 * ClassName: Main
 * Package: test2
 * Description:有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子
 * 都不死，问第n个月的兔子对数为多少？(斐波那契数列的迭代解法)
 *
 * @Author 行空XKong
 * @Create 2024/4/29 21:52
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(fun(6));
    }

    private static int fun(int n) {
        if (n < 3) {
            return 1;
        }
        int prev1 = 1;//记录一个月前的数量
        int prev2 = 1;//记录两个月前的数量
        int num = 0;
        for (int i = 3; i <= n; ++i) {
            num = prev1 + prev2;
            prev2 = prev1;
            prev1 = num;
        }
        return num;
    }
}
