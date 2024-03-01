import java.util.Scanner;

/**
 * ClassName: Test2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/3/1 20:13
 * @Version 1.0
 */
//JAVA20 验证年龄
public class Test2 {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }
}

class Person {
    private int age;

    void setAge(int age) {
        this.age = (age <= 0) ? 0 : ((age >= 200) ? 200 : age);
    }

    int getAge() {
        return age;
    }
}
