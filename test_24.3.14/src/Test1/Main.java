package Test1;

/**
 * ClassName: Main
 * Package: Test1
 * Description:面试题 17.04. 消失的数字
 *
 * @Author 行空XKong
 * @Create 2024/3/14 20:46
 * @Version 1.0
 */
class Solution {
    //方法1（异或法）
    public int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i <= nums.length; i++) {
            num ^= i;
        }
        //利用异或的特性，异或完num的值就是少的那个数
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }
//    //方法2（数学法）
//    public int missingNumber(int[] nums) {
//        int n = nums.length;
//        int total = n * (n + 1) / 2;
//        int arrSum = 0;
//        for (int i = 0; i < n; i++) {
//            arrSum += nums[i];
//        }
//        return total - arrSum;
//    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(new Solution().missingNumber(arr));
    }
}
