package test4;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: test4
 * Description:JAVA26 实现接口
 *
 * @Author 行空XKong
 * @Create 2024/3/5 19:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }
}

interface Comparator {
    /**
     * 返回两个整数中的最大值
     */
    int max(int x, int y);
}

class ComparatorImpl implements Comparator {
    public int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
