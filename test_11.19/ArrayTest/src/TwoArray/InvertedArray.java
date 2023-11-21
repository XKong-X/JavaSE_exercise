package TwoArray;

/**
 * ClassName: InvertedArray
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/21 12:55
 * @Version 1.0
 */
public class InvertedArray {
    public static void main(String[] args) {
        int[] arr1=new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int r=arr1.length-1;
        int l=0;
//        方式1：
        while(l<r){
            int tmp=arr1[l];
            arr1[l]=arr1[r];
            arr1[r]=tmp;
            l++;r--;
        }

//        方式2：(不建议)
//        int[]arr2=new int[arr1.length];
//        for (int i = r; i >= 0; i--) {
//            arr2[i]=arr1[l];
//            l++;
//        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
