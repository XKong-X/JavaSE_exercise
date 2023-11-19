package OneArray;

/**
 * ClassName: AMP1
 * Package: OneArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 17:16
 * @Version 1.0
 */
public class AMP1 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3};
        int[] a2 = a1;
        a2[1] = 10;
        System.out.println(a1[1]);
        System.out.println(a1);
        System.out.println(a2);
    }
}
