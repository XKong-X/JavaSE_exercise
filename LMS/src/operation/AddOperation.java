package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

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
        //判断是否存满
        if (bookList.getUsedSize() == bookList.getSumSize()) {
            System.out.println("当前书架已存满，存入失败！");
            return;
        }

        System.out.println("增加图书！");
        Scanner in = new Scanner(System.in);
        System.out.print("请输入书名：");
        String name = in.nextLine();
        System.out.print("请输入作者：");
        String author = in.nextLine();
        System.out.print("请输入类型：");
        String type = in.nextLine();
        System.out.print("请输入价格：");
        int price = in.nextInt();

        Book book = new Book(name, author, type, price);
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                System.out.println("当前书架已有该书，存入失败！");
                return;
            }
        }
        bookList.setBook(book, currentSize);
        bookList.setUsedSize(++currentSize);
        System.out.println("存入成功！");
    }
}
