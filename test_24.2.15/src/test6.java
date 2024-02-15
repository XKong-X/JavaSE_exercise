import java.util.Scanner;

//给定两个数，求这两个数的最大公约数
//例如：
//输入：20 40
//输出：20
public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        System.out.println(n);
    }
}
