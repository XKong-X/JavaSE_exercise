class ForTest {
	public static void main(String[] args) {
		int i = 0;
		int count=0;
		int sum=0;
		for(i=2;i<101;i+=2){
			System.out.println("i="+i);
		count++;
		sum+=i;
		}
		System.out.println("count="+count+"sum"+sum);
	}
}
