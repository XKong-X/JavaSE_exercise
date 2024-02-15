import java.util.Scanner;

//求一个整数，在内存当中存储时，二进制1的个数
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.println(count);
    }
}
