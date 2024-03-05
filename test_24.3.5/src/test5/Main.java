package test5;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: test5
 * Description:JAVA27 重写父类方法
 *
 * @Author 行空XKong
 * @Create 2024/3/5 21:13
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            System.out.println(sub.sum());
        }
    }
}

class Base {
    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    public final int sum() {
        return getX() + getY();
    }
}

class Sub extends Base {
    public Sub(int x, int y) {
        super(x, y);
    }

    public int getX() {
        return 10 * super.getX();
    }
}