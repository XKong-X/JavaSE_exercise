package TwoArray;

/**
 * ClassName: TwoArraySum
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/20 20:02
 * @Version 1.0
 */
public class TwoArraySum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);
    }
}
