import java.util.Scanner;

/**
 * ClassName: Test1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/28 12:47
 * @Version 1.0
 */
//JAVA16 数组遍历
public class Test1 {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }
        max = ary[0];
        min = ary[0];
        for (int i = 1; i < ary.length; i++) {
            if (max < ary[i]) {
                max = ary[i];
            }
            if (min > ary[i]) {
                min = ary[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
