package operation;

import book.BookList;

import java.util.Scanner;

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
        //判断是否有书
        if (bookList.getBook(0) == null) {
            System.out.println("当前书架为空，删除失败！");
            return;
        }


        System.out.print("请输入要删除的图书的书名：");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                //把最后一本书放到删除的书的位置
                bookList.setBook(bookList.getBook(currentSize - 1), i);
                //把最后一本书的位置的数据置为null
                bookList.setBook(null, currentSize - 1);
                //调整已存书的数量
                bookList.setUsedSize(--currentSize);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("当前书架无该书，删除失败！");
    }
}
