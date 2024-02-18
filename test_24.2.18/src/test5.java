//实现一个方法 sum, 以数组为参数, 求数组所有元素之和
public class test5 {
    public static int sum(int[] arr) {
        int sumNum = 0;
        for (int x : arr) {
            sumNum += x;
        }
        return sumNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
    }
}
