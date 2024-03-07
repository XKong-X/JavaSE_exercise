package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * ClassName: ReturnOperation
 * Package: operation
 * Description:归还功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:46
 * @Version 1.0
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //判断是否存满
        if (bookList.getUsedSize() == bookList.getSumSize()) {
            System.out.println("当前书架已存满，无法归还！");
            return;
        }

        System.out.print("请输入要归还的图书的书名：");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                Book book = bookList.getBook(i);
                if (!book.getCondition()) {
                    System.out.println("该书未被借出，无法归还！");
                    return;
                }
                book.setCondition(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("当前书架无该书，归还失败！");
    }
}
