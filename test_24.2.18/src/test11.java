import java.util.Arrays;

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素
//你可以假设数组是非空的，并且给定的数组总是存在多数元素
//示例 1：
//输入：[3,2,3]
//输出：3
//示例 2：
//输入：[2,2,1,1,1,2,2]
//输出：2
public class test11 {
    //方法1
    public static int fun1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    //方法2（摩尔投票法）
    public static int fun2(int[] arr) {
        int num = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                num = arr[++i];
                count++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(fun1(arr));
        System.out.println(fun2(arr));
    }
}
