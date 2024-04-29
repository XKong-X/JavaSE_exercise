package test1;

/**
 * ClassName: Main
 * Package: test1
 * Description:一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多 少
 * 米？第10次反弹多高？
 *
 * @Author 行空XKong
 * @Create 2024/4/29 21:30
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        double h = 100.0;
        double sum = h;
        int count = 1;
        while (count++ != 10) {
            sum += h;//回弹走过的路程 + 再次落下走过的路程，就是上次的高度
            h /= 2.0;
            //记录最后一次回弹的高度
            double rebound = h / 2.0;
            System.out.println("第" + count + "次落地时，共经过" + sum + "米。" +
                    "第" + count + "次反弹" + rebound + "米。");
        }
    }
}

