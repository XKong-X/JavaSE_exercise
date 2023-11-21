package ArrayExer;

/**
 * ClassName: ArrayExpansion
 * Package: ArrayExer
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/21 13:21
 * @Version 1.0
 */
public class ArrayExpansion {
    public static void main(String[] args) {
        int[]arr1=new int[]{1,2,3,4,5};

        int[]arr2=new int[arr1.length<<1];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        int[] arr3={10,20,30};
        for (int i = 0; i < arr3.length; i++) {
            arr2[arr1.length+i]=arr3[i];
        }

        arr1=arr2;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
