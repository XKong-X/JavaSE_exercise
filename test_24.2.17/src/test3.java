//写一个递归方法，输入一个非负整数，返回组成它的数字之和(例如：1729返回19（1+7+2+9）)
public class test3 {
    public static int numSum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + numSum(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(numSum(1729));
    }
}
