package TwoArray;

/**
 * ClassName: ArrayCopy
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/21 12:11
 * @Version 1.0
 */
public class ArrayCopy {
//    public static void main(String[] args) {
//        int[]arr1,arr2;
//
//        arr1=new int[]{2,3,5,7,1,13,17,19};
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+" ");
//        }
//
//        arr2=arr1;
//
//        System.out.println();
//
//        for (int i = 0; i < arr2.length; i++) {
//            if(i%2==0){
//                arr2[i]=i;
//            }
//            System.out.print(arr1[i]+" ");
//        }
//    }
    public static void main(String[] args) {
        int[] arr1, arr2;

        arr1 = new int[]{2, 3, 5, 7, 1, 13, 17, 19};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
            System.out.print(arr1[i] + " ");
        }

    }
}
