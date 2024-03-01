import java.util.Scanner;

/**
 * ClassName: Test1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/1 19:59
 * @Version 1.0
 */
//JAVA19 修改Data类的定义
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }
}

class Data {
    private int x;
    private int y;

    Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
