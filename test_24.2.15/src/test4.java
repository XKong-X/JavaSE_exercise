//编写程序数一下 1到 100 的所有整数中出现多少个数字9
public class test4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == 9)
                    count++;
                tmp /= 10;
            }
        }
        System.out.println(count);
    }
}
