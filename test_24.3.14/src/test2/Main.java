package test2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName: Main
 * Package: test2
 * Description:189. 轮转数组
 *
 * @Author 行空XKong
 * @Create 2024/3/14 21:43
 * @Version 1.0
 */
class Solution {
    //    //方法1（会超时）
//    public void rotate(int[] nums, int k) {
//        //判断k等不等于0，判断k是不是数组长度的倍数
//        if (k == 0 || k % nums.length == 0) {
//            return;
//        }
//        int count = k % nums.length;
//        for (int i = 0; i < count; i++) {//数组整体移动次数
//            int lastNum = nums[nums.length - 1];//保存数组最后一个数
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = lastNum;//把最后一个数移动到最前面
//        }
//    }
    //方法2(三次转置法)
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    void rotate(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
