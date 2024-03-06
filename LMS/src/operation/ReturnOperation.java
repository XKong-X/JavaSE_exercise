package operation;

import book.BookList;

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
        System.out.println("归还图书！");
    }
}
