package test1;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: test1
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/5 11:56
 * @Version 1.0
 */
//JAVA23 定义打印方法
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            print(Class.forName(className).newInstance());
        }
    }

    public static void print(Object obj) {
        System.out.print(obj.toString());
    }
}

class First {
    public String toString() {
        return "First";
    }
}

class Second {
    public String toString() {
        return "Second";
    }
}

class Third {
    public String toString() {
        return "Third";
    }
}
