package ArrayExer;

/**
 * ClassName: BinarySearch
 * Package: ArrayExer
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/23 22:46
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int l=0;
        int r= arr.length-1;
        int num=5;
        boolean flag=true;
        while(l<=r){
            if(arr[(l+r)/2]<num){
                l=(l+r)/2+1;
            }
            else if(arr[(l+r)/2]>num){
                r=(l+r)/2-1;
            }
            else{
                System.out.println("出现过，相应索引为："+(l+r)/2);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("未找到");
        }
    }
}
