package book;

/**
 * ClassName: Book
 * Package: book
 * Description:书
 *
 * @Author 行空XKong
 * @Create 2024/3/6 19:04
 * @Version 1.0
 */
public class Book {
    private String name;
    private String author;
    private String type;
    private int price;
    private boolean condition;

    public Book(String name, String author, String type, int price) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名:'" + name + '\'' +
                ", 作者:'" + author + '\'' +
                ", 类型:'" + type + '\'' +
                ", 价格:" + price +
                ", 状态:" + (condition ? "已借出" : "未借出")+
                '}';
    }
}
