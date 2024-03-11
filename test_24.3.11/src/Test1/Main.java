package Test1;

import java.util.Arrays;

/**
 * ClassName: Main
 * Package: Test1
 * Description:合并两个有序数组
 *
 * @Author 行空XKong
 * @Create 2024/3/11 19:03
 * @Version 1.0
 */
class Solution {
    //    //方法一
//    public static void MergedArray(int[] A, int n, int[] B, int m) {
//        int i = n - 1;
//        int j = m - 1;
//        for (int k = n + m - 1; k >= 0; k--) {
//            if (i >= 0 && j >= 0) {
//                if (A[i] > B[j]) {
//                    A[k] = A[i];
//                    i--;
//                } else {//A[i] < B[j]
//                    A[k] = B[j];
//                    j--;
//                }
//            } else if (i >= 0) {
//                while (i >= 0) {
//                    A[k] = A[i];
//                    i--;
//                }
//            } else {//j>=0
//                while (j >= 0) {
//                    A[k] = B[j];
//                    j--;
//                }
//            }
//        }
//    }
    //方法2
    public static void MergedArray(int[] A, int n, int[] B, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {//A[i] < B[j]
                A[k--] = B[j--];
            }
        }
        while (i >= 0) {//j<0
            A[k--] = A[i--];
        }
        while (j >= 0) {//i<0
            A[k--] = B[j--];
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int[] num1 = new int[]{2, 4, 6, 0, 0, 0};
        int[] num2 = new int[]{1, 13, 19};
        int n = 3;
        int m = 3;
        Solution.MergedArray(num1, n, num2, m);
        System.out.println(Arrays.toString(num1));
    }
}
