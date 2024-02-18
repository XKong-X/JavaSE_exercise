import java.util.Scanner;

//递归求解汉诺塔问题
public class test1 {
    public static int count = 0;

    public static void move(char x, char y) {
        count++;
        System.out.println("从" + x + "柱上移动一个盘到" + y + "柱上");
    }

    public static void hanoiMove(int n, char a, char b, char c) {
        if (n == 1) {
            move(a, c);
            return;
        }
        hanoiMove(n - 1, a, c, b);
        move(a, c);
        hanoiMove(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoiMove(n, 'a', 'b', 'c');
        System.out.println("共移动了" + count + "次");
    }
}
