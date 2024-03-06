import book.BookList;
import user.AdmUser;
import user.NorUser;
import user.User;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:主程序
 *
 * @Author 行空XKong
 * @Create 2024/3/6 20:06
 * @Version 1.0
 */
public class Main {
    public static User login() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = in.nextLine();
        System.out.print("请选择身份(1.管理员 2(或其他字符).普通用户)：");
        char choice = in.next().charAt(0);
        //判断是管理员还是普通用户
        return choice == '1' ? new AdmUser(name) : new NorUser(name);
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();

        while (true) {
            int choice = user.menu();
            //System.out.print("choice:" + choice);
            user.doOperation(bookList, choice);
        }
    }
}