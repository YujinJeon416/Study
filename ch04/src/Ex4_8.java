class Ex4_8 {
	public static void main(String args[]) { 
		int i=1; //scope(범위) - 선언위치부터 선언된 블럭의 끝까지
		
		//조건식을 생략하면 true로 간주되어서 무한반복문이 됨
		for (; ; ) { // 괄호안의 문장을 3번씩 반복
			System.out.println(i);
		}
//		System.out.println(i);
	}
}