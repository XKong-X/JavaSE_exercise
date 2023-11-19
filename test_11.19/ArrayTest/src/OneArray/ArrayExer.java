package OneArray;

/**
 * ClassName: ArrayExer
 * Package: OneArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 17:24
 * @Version 1.0
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,4,2};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            //int value = index[i];
            tel += arr[index[i]];
        }
        System.out.println(tel);
    }
}
