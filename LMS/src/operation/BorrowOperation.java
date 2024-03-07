package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * ClassName: BorrowOperation
 * Package: operation
 * Description:借阅功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:45
 * @Version 1.0
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //判断是否有书
        if (bookList.getBook(0) == null) {
            System.out.println("当前书架为空，无法借阅！");
            return;
        }

        System.out.print("请输入要借阅的图书的书名：");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                Book book = bookList.getBook(i);
                if (book.getCondition()) {
                    System.out.println("该书已被借出，无法借阅！");
                    return;
                }
                book.setCondition(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("当前书架无该书，借阅失败！");
    }
}
