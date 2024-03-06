package user;

import operation.*;

import java.util.Scanner;

/**
 * ClassName: AdmUser
 * Package: user
 * Description:管理员用户
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:54
 * @Version 1.0
 */
public class AdmUser extends User {
    public AdmUser(String name) {
        super(name);
        super.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    public int menu() {
        System.out.println("******欢迎管理员用户******");
        System.out.println("1.查找");
        System.out.println("2.新增");
        System.out.println("3.删除");
        System.out.println("4.显示");
        System.out.println("0.退出");
        System.out.println("***********************");

        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的选择：");
        return in.nextInt();
    }
}
