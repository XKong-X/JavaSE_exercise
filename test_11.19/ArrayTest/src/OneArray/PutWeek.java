package OneArray;

import java.util.Scanner;

/**
 * ClassName: PutWeek
 * Package: OneArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 17:37
 * @Version 1.0
 */
public class PutWeek {
    public static void main(String[] args) {
        String[] week = {"Error!","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入（1-7）：");
        System.out.println();
        int day = scan.nextInt();
        if(day < 1 || day > 7){
            System.out.println("输入错误！");
        }else{
            System.out.println(week[day]);
        }
        scan.close();
    }
}
