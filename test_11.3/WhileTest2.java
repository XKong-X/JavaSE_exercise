class WhileTest2 {
	public static void main(String[] args) {
		double paper = 0.1;
		double mount = 8848860;
		int count=0;
		while(paper<=mount){
			paper*=2;
			count++;
		}
		System.out.println("´ÎÊý"+count);
	}
}
