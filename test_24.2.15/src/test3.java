public class test3 {
    public static void main(String[] args) {
        for(int i = 1000; i <= 2000; i += 4) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
                System.out.print(i + " ");
        }
    }
}
