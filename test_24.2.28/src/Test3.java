/**
 * ClassName: Test3
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/28 13:11
 * @Version 1.0
 */
//JAVA18 二维数组求和
public class Test3 {
    public static void main(String[] args) {
        int[][]  arr = {{11,33,55},{22,44,66,88}, {131,214,315,146},
                {928,827,726,625},{424,525}};
        int sum=add(arr);
        System.out.println(sum);
    }

    public static int add(int[][] arr) {
        int sum=0;
        for (int[] tmp : arr) {
            for (int x : tmp) {
                sum += x;
            }
        }
        return sum;
    }
}
