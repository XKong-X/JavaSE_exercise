//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型)
public class test6 {
    public static double avg(int[] arr) {
        double sum = 0;
        for (double x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(avg(arr));
    }
}
