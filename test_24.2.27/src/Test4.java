import java.util.Scanner;

/**
 * ClassName: Test4
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/27 20:44
 * @Version 1.0
 */
//JAVA12 小球走过路程计算
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        int n =scanner.nextInt();
        float sum = 0.0f;
        for (int i = 0; i < n; i++) {
            sum += h;
            h /= 2.0f;
            sum += h;
        }
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum - h));
    }
}
