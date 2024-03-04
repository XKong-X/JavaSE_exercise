package Test1;

import java.util.Scanner;

/**
 * ClassName: Test1.Test1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/4 23:03
 * @Version 1.0
 */
//JAVA21 补全构造方法
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
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

    public int getY() {
        return y;
    }
}

class Sub extends Base {
    private int z;

    public Sub(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }
}