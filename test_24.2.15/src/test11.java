import java.util.Scanner;

//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            String keyNum = scanner.nextLine();
            System.out.println("请输入，你还有" + count + "次机会！");
            if (keyNum.equals("1234")) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！");
            }
            count--;
        }
        if (count == 0) {
            System.out.println("失败次数过多，已锁定！");
        }
    }
}
