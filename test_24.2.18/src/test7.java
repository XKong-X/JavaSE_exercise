import java.util.Arrays;

//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
//如数组：[1,2,3,4,5,6]
//调整后可能是：[1, 5, 3, 4, 2, 6]
public class test7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            //从左边开始找偶数
            while (l < r && arr[l] % 2 != 0) {
                l++;
            }
            //从右边开始找奇数
            while (l < r && arr[r] % 2 == 0) {
                r--;
            }
            //找完进行交换
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            //由于已经进行交换，下一次循环会会自动++和--，因此不用在后面++和--
        }
        System.out.println(Arrays.toString(arr));
    }
}
