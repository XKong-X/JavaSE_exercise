package TwoArray;

/**
 * ClassName: TwoArrayTest
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 19:57
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        String[][] arr2 = new String[3][4];

        double[][] arr3 = new double[2][];

        int[][] arr4 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        System.out.println(arr4[1][1]);

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();

            int[][] arr5 = new int[3][2];

            System.out.println(arr5[0]);
            System.out.println(arr5[1]);

            System.out.println(arr5[0][0]);

            boolean[][] arr6 = new boolean[3][4];

            System.out.println(arr6[0]);

            System.out.println(arr6[0][0]);

            String[][]arr7=new String[4][2];

            System.out.println(arr7[0]);

            System.out.println(arr7[0][0]);

            int[][]arr8=new int[4][];

            System.out.println(arr8[0]);//null

            System.out.println(arr8[0][0]);//报错
        }
    }
}
