package OneArray;

import java.util.Scanner;

/**
 * ClassName: StudentResults
 * Package: OneArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 19:03
 * @Version 1.0
 */
public class StudentResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num = scan.nextInt();
        int[] sum = new int[num];
        int max = 0;
        System.out.println("请输入" + num + "个成绩");
        for (int i = 0; i < sum.length; i++) {
            sum[i] = scan.nextInt();
            if (max < sum[i]) max = sum[i];
        }
        System.out.println("最高分是：" + max);
//        for (int i = 0; i < sum.length; i++) {
//            if (sum[i] >= max-10)
//                System.out.println("student " + i + " score is " + sum[i] + " grade is A ");
//            else if (sum[i] >= max-20)
//                System.out.println("student " + i + " score is " + sum[i] + " grade is B ");
//            else if (sum[i] >= max-30)
//                System.out.println("student " + i + " score is " + sum[i] + " grade is C ");
//            else
//                System.out.println("student " + i + " score is " + sum[i] + " grade is D ");
//        }
        char grade = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] >= max - 10)
                grade = 'A';
            else if (sum[i] >= max - 20)
                grade = 'B';
            else if (sum[i] >= max - 30)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("student " + i + " score is " + sum[i] + " grade is " + grade);
        }
        scan.close();
    }
}
