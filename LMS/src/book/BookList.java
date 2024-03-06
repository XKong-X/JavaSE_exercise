package book;

/**
 * ClassName: BookList
 * Package: book
 * Description:书架
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:04
 * @Version 1.0
 */
public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.books = new Book[10];
        this.books[0] = new Book("三国演义", "罗贯中", "小说" ,20);        this.books[0] = new Book("三国演义", "罗贯中", "小说" ,20);
        this.books[1] = new Book("西游记", "吴承恩", "小说" ,15);
        this.books[2] = new Book("红楼梦", "曹雪芹", "小说" ,25);

        //确定当前书架上有多少本书
        while (books[this.usedSize] != null) {
            this.usedSize++;
        }
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(Book book, int pos) {
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
