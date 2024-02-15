import java.util.Random;
import java.util.Scanner;

//完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序
public class test10 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(101);//[0-101)即[0-100]
        System.out.print("生成随机数字：" + randNum);
        System.out.println();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入猜的数字：");
            int num = scanner.nextInt();

            if(num > randNum)
                System.out.println("猜大了！");
            else if(num < randNum)
                System.out.println("猜小了！");
            else{
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
