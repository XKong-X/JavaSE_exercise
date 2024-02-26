import java.util.Scanner;

/**
 * ClassName: Test8
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 23:37
 * @Version 1.0
 */
//JAVA8 邮箱验证
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        System.out.println(str.matches(emailMatcher)? "邮箱格式合法" : "邮箱格式不合法");
    }
}
