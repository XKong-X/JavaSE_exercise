import java.util.Scanner;

//求出0～n之间的所有“水仙花数”并输出
public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 100; i <= n; i++) {
            int tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += (tmp % 10) * (tmp % 10) * (tmp % 10);
                tmp /= 10;
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
