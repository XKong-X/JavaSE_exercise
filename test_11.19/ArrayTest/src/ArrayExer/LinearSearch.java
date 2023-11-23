package ArrayExer;

/**
 * ClassName: LinearSearch
 * Package: ArrayExer
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/23 22:28
 * @Version 1.0
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[]arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==5){
                System.out.println("出现过，相应索引为："+i);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("未找到此元素");
        }
    }
}
