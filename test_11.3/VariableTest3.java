class VariableTest3 {
	public static void main(String[] args) {
		long l1 = 123123123123l;
		//int i1=1;
		float f1=12.3f;
		double d1 = 12.3;
		int i1 = (int)d1;
		short s1 = (short)i1;
		System.out.println("Hello World!"+l1+f1+i1+s1+d1+"\n");
		byte b2 = 12;
		method(b2);
	}
	public static void method(int num){
		System.out.println("num= " + num);
	}
}
