package operation;

import book.BookList;

/**
 * ClassName: ExitOperation
 * Package: operation
 * Description:退出功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:44
 * @Version 1.0
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
    }
}
