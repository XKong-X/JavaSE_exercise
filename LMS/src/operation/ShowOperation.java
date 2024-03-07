package operation;

import book.Book;
import book.BookList;

/**
 * ClassName: ShowOperation
 * Package: operation
 * Description:显示功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:34
 * @Version 1.0
 */
public class ShowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //判断是否有书
        if (bookList.getBook(0) == null) {
            System.out.println("当前书架为空！");
            return;
        }

        System.out.println("显示图书！");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
