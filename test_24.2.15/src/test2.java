//打印 1 - 100 之间所有的素数
public class test2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i += 2){
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print(i + " ");
        }
    }
}
