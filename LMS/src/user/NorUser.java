package user;

import operation.*;

import java.util.Scanner;

/**
 * ClassName: NorUser
 * Package: user
 * Description:普通用户
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:55
 * @Version 1.0
 */
public class NorUser extends User {
    public NorUser(String name) {
        super(name);
        super.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public int menu() {
        System.out.println("******欢迎普通用户******");
        System.out.println("1.查找");
        System.out.println("2.借阅");
        System.out.println("3.归还");
        System.out.println("0.退出");
        System.out.println("*********************");

        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的选择：");
        return in.nextInt();
    }
}
