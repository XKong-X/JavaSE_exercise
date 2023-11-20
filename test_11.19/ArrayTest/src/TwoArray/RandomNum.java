package TwoArray;

/**
 * ClassName: RandomNum
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/20 21:14
 * @Version 1.0
 */
public class RandomNum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        int min = 100;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i]+"\t");

            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }

            sum += arr[i];

            avg = sum / arr.length;
        }
        System.out.println("\n最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("总和："+sum);
        System.out.println("平均值："+avg);
    }
}
