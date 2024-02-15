import java.util.Scanner;

//给定一个数字，判定一个数字是否是素数
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
            System.out.println("是素数！");
        else
            System.out.println("不是素数！");
    }
}
