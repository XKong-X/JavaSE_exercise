package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * ClassName: FindOperation
 * Package: operation
 * Description:查找功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:44
 * @Version 1.0
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //判断是否有书
        if (bookList.getBook(0) == null) {
            System.out.println("当前书架为空！");
            return;
        }

        System.out.print("请输入要查找的图书的书名：");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())) {
                System.out.println("成功找到该图书，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到该图书！");
    }
}
