import java.util.Scanner;

//求斐波那契数列的第n项(迭代实现)
public class test5 {
    public static int fibNum(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibNum(n - 1) + fibNum(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println(fibNum(n));
        } else {
            System.out.println("Num is error!");
        }
    }
}
