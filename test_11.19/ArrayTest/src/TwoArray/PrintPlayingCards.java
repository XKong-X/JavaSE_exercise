package TwoArray;

/**
 * ClassName: PrintPlayingCards
 * Package: TwoArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/21 11:16
 * @Version 1.0
 */
public class PrintPlayingCards {
    public static void main(String[] args) {
        String[]name={"黑桃","红桃","梅花","方片"};
        String[]size={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < size.length; j++) {
                System.out.print(name[i]+size[j]+" ");
            }
            System.out.println();
        }
    }
}
