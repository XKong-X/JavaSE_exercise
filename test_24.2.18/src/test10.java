import java.util.Arrays;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
//示例 1:
//输入: [2,2,1]
//输出: 1
//示例 2:
//输入: [4,1,2,1,2]
//输出: 4
public class test10 {
    public static int findOnceNum(int[] arr) {
        int ret = 0;
        for (int x : arr) {
            ret ^= x;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(findOnceNum(arr));
    }
}
