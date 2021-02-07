class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 = 10의 6제곱
		int b = 2_000_000;    // 2,000,000   2백만 = 10의 6제곱

		//10의 12제곱, int의 범위는 10의 9제곱 
		long c =(long) a * b;       // a * b = 2,000,000,000,000 ?
        //a나 b둘중 하나를 long으로 형변환 해줘야 한다. 안하면 오버플로우 에러
		System.out.println(c);
	}
}