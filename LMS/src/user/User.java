package user;

import book.BookList;
import operation.IOperation;

/**
 * ClassName: User
 * Package: user
 * Description:用户
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:55
 * @Version 1.0
 */
abstract public class User {
    protected String userName;
    protected IOperation[] iOperations;

    public User(String name) {
        this.userName = name;
    }

    public abstract int menu();

    public void doOperation(BookList bookList, int choice) {
        iOperations[choice].work(bookList);
    }
}
