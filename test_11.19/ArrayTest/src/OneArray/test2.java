package OneArray;

/**
 * ClassName: test2
 * Package: OneArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 13:40
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        int arr1[] = new int[3];
        System.out.println(arr1[0]);

        short arr2[] = new short[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        double arr3[] = new double[5];
        System.out.println(arr3[0]);

        char arr4[] = new char[4];
        System.out.println(arr4[0]);

        boolean arr5[] = new boolean[4];
        System.out.println(arr5[0]);

        String arr6[] = new String[5];
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i]);
        }
    }
}
