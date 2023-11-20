package TwoArray;

/**
 * ClassName: PointAvg
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/20 21:59
 * @Version 1.0
 */
public class PointAvg {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,6,8,9,8,0,1,2,7,3};
        int max=0;
        int min=10;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("得分："+(sum-max-min)/arr.length);
    }
}
