import java.util.Scanner;

/**
 * ClassName: Test7
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 行空XKong
 * @Create 2024/2/26 22:43
 * @Version 1.0
 */
//JAVA7 判断学生成绩等级
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade =scanner.next();
        if (grade.equals("A")) {
            System.out.println("优秀");
        } else if (grade.equals("B")) {
            System.out.println("良好");
        } else if (grade.equals("C")) {
            System.out.println("及格");
        } else if (grade.equals("D")) {
            System.out.println("不及格");
        } else {
            System.out.println("未知等级");
        }
    }
}
