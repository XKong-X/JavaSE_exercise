//在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值
public class test7 {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static double max(double a, double b, double c) {
        double max = a;
        max = max > b ? max : b;
        max = max > c ? max : c;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(2.0, 1.0, 3.0));
    }
}
