package operation;

import book.BookList;

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
        System.out.println("借阅图书！");
    }
}
