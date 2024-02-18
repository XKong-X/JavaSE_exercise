import java.util.Arrays;

//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
public class test3 {
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printArray(arr);
    }
}
