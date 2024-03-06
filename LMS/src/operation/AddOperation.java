package operation;

import book.BookList;

/**
 * ClassName: Addoperation
 * Package: operation
 * Description:增加功能
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:43
 * @Version 1.0
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("增加图书！");
    }
}
