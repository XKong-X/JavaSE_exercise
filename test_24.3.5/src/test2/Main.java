package test2;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: test2
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/5 11:58
 * @Version 1.0
 */
//
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base obj = (Base) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }

    // //方法一（面向结果编程）
    // public static String getClassName(Base obj) {
    //     if (obj instanceof Sub1) {
    //         return "Sub1";
    //     } else if (obj instanceof Sub2) {
    //         return "Sub2";
    //     } else {
    //         return "Base";
    //     }
    // }

    //方法二
    public static String getClassName(Base obj) {
        return obj.getClass().getName();
    }
}

class Base {
}

class Sub1 extends Base {
}

class Sub2 extends Base {
}