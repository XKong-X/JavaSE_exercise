package Test2;
import java.util.Scanner;

/**
 * ClassName: Test2.Test2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/4 23:06
 * @Version 1.0
 */
//JAVA22 重写计算逻辑
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            sub.calculate();
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

    public void calculate() {
        System.out.println(getX() * getY());
    }
}

class Sub extends Base {
    public Sub(int x, int y) {
        super(x, y);
    }

    public void calculate() {
        if (getY() != 0) {
            System.out.print(getX() / getY());
        } else {
            System.out.print("Error");
        }
    }
}