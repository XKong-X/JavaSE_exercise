package operation;

import book.BookList;

/**
 * ClassName: DelOperation
 * Package: operation
 * Description:删除功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:43
 * @Version 1.0
 */
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
    }
}
