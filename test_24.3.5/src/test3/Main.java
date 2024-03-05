package test3;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: test3
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/5 12:38
 * @Version 1.0
 */
//JAVA25 实现抽象方法
public class Main {
    public static void main(String[] args) {
        Base base = new Sub();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            base.setX(x);
            base.setY(y);
            System.out.println(base.calculate());
        }
    }
}

abstract class Base {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calculate() {
        if (avg() == 0) {
            return 0;
        } else {
            return sum() / avg();
        }
    }

    /**
     * 返回x和y的和
     */
    public abstract int sum();

    /**
     * 返回x和y的平均值
     */
    public abstract int avg();
}

class Sub extends Base {
    public int sum() {
        return super.getX() + super.getY();
    }

    public int avg() {
        return sum() / 2;
    }
}
