import java.util.Arrays;

//给定一个整型数组, 实现冒泡排序(升序排序)
public class test13 {
    public static void bubbleSort(int[] arr) {
        //趟数
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            //比较次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            //未进行交换说明有序，跳出方法
            if (!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 72, 23, 12};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
