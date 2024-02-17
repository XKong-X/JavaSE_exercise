//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）
public class test1 {
    public static void print(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        print(n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        print(1234);
    }
}
