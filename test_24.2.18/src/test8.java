import java.util.Scanner;

//给定一个有序整型数组, 实现二分查找
public class test8 {
    public static int binarySearch(int[] arr, int n) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            if (arr[(l + r) / 2] < n) {
                l = (l + r) / 2 + 1;
            } else if (arr[(l + r) / 2] > n) {
                r = (l + r) / 2 - 1;
            } else {
                return (l + r) / 2;
            }
        }
        return -1;//表示没找到
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = binarySearch(arr, n);
        if (ret != -1) {
            System.out.println("下标为" + ret);
        } else {
            System.out.println("没找到");
        }
    }
}
