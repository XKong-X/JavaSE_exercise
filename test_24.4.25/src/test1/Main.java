package test1;

/**
 * ClassName: Main
 * Package: test1
 * Description:猴子吃桃问题。猴子第一天摘下若干个桃子，当时就吃了一半，还不过瘾，就又吃了一个。第二天又将剩下的
 * 桃子吃掉一半，又多吃了一个。以后每天都吃前一天剩下的一半零一个。到第 10 天再想吃的时候就剩一个桃子了,
 * 求第一天共摘下来多少个桃子？
 *
 * @Author 行空XKong
 * @Create 2024/4/25 13:32
 * @Version 1.0
 */
class Main {
    public static void main(String[] args) {
//        //方法一
//        for (int i = 0; i < 1_0000; ++i) {
//            int tmp = i;
//            int count = 9;
//            while (tmp > 0 && count-- != 0) {
//                tmp = tmp / 2 - 1;
//            }
//            if (tmp == 1) {
//                System.out.println(i);
//                break;
//            }
//        }

//        //方法二
//        int num = 1;
//        for (int i = 10; i > 1; --i) {
//            num = (num + 1) * 2;
//        }
//        System.out.println(num);

        //方法三
        int total=1;
        int day=10;
        for (int i = 10; i > 0; --i) {
            System.out.println("第" + day + "天，有桃子" + total + "颗");
            total = (total + 1) * 2;
            --day;
        }
    }
}
