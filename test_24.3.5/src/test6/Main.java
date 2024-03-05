package test6;

/**
 * ClassName: Main
 * Package: test6
 * Description:JAVA28 创建单例对象
 *
 * @Author 行空XKong
 * @Create 2024/3/5 21:30
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance == null ? instance = new Singleton() : instance;
    }
}
