import java.util.Scanner;
class WhileTest1 {
	public static void main(String[] args) {
		int target = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		System.out.print("������1-100��Χ�ڵ�һ��������");
		int guess = scan.nextInt();
		int count = 1;
		while(target != guess){
			
			if(guess==target){
					
					break;
			}
			else if(guess>target){
					System.out.println("�´���");
					System.out.print("������1-100��Χ�ڵ�һ��������");
					guess = scan.nextInt();
			}
			else{
					System.out.println("��С��");
					System.out.print("������1-100��Χ�ڵ�һ��������");
					guess = scan.nextInt();
			
			}
			count++;
		}
		System.out.println("�¶���");
		System.out.println("����"+count+"��");
		scan.close();
	}
}
