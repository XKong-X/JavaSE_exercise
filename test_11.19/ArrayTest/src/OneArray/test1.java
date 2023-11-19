package OneArray;

/**
 * ClassName: test1
 * Package: OneArray
 * Description:
 *
 * @Author 行空XKong
 * @Create 2023/11/19 13:02
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num;
        num = 20;

        double[]p;
        p = new double[]{ 20.32,43.21,43.22 };

//      String[] foods;
//      foods = new String[]{"龙须菜","拌海蜇"};

        String[] foods = new String[4];

        int arr1[] = new int[4];
        int arr2[] = {1,2,3,4};
        int arr3[] = new int[]{0};

        System.out.println(p[1]);
        System.out.println(arr2[3]);

        System.out.println(arr2.length);
        System.out.println(p.length);

        int i=0;
        for(i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);

        }

        for (i = 0; i < p.length; i++) {
            System.out.println(p.length);
        }
    }
}
