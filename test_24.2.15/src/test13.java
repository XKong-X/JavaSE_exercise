import java.util.Scanner;

//输出一个整数的每一位，如：123的每一位是3，2，1
public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
    }
}
