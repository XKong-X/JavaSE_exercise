package TwoArray;

/**
 * ClassName: YHTriangle
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/20 22:06
 * @Version 1.0
 */
public class YHTriangle {
    public static void main(String[] args) {
        int[][]arr=new int[10][];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];

            arr[i][0]=1;arr[i][i]=1;

            if(i>=2){
                for (int j = 1; j < arr[i].length-1; j++) {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
