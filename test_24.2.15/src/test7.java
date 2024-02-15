//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
public class test7 {
    public static void main(String[] args) {
        int flag = 1;
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += flag * (1.0 / i);
            flag *= -1;
        }
        System.out.println(sum);
    }
}
