import java.util.Scanner;

//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //求奇数位
        System.out.print("奇数：");
        for (int i = 30; i >=0; i -= 2) {
            System.out.print(((n >>> i) & 1) + " ");
        }
        System.out.println();
        //求偶数位
        System.out.print("偶数：");
        for (int i = 31; i >=1; i -= 2) {
            System.out.print(((n >>> i) & 1) + " ");
        }
    }
}
