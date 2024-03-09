package Test2;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: Test2
 * Description:HJ1 字符串最后一个单词的长度
 *
 * @Author 行空XKong
 * @Create 2024/3/9 22:54
 * @Version 1.0
 */
////方法1（提交能过，但idea不行）
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        boolean flag;
//        String str = "";
//        while (flag = in.hasNext()) {
//            if (!flag) {
//                break;
//            }
//            str = in.next();
//        }
//        System.out.print(str.length());
//    }
//}
//方法2
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int index = str.lastIndexOf(" ");
        System.out.print(str.substring(++index).length());
    }
}