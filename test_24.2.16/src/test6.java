//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
public class test6 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 30));
        System.out.println(sum(1.0, 2.0, 3.0));
    }
}
