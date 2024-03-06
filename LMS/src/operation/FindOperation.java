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
