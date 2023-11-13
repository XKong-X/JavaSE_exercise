import java.util.Scanner;
class WhileTest1 {
	public static void main(String[] args) {
		int target = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入1-100范围内的一个整数：");
		int guess = scan.nextInt();
		int count = 1;
		while(target != guess){
			
			if(guess==target){
					
					break;
			}
			else if(guess>target){
					System.out.println("猜大了");
					System.out.print("请输入1-100范围内的一个整数：");
					guess = scan.nextInt();
			}
			else{
					System.out.println("猜小了");
					System.out.print("请输入1-100范围内的一个整数：");
					guess = scan.nextInt();
			
			}
			count++;
		}
		System.out.println("猜对了");
		System.out.println("猜了"+count+"次");
		scan.close();
	}
}
