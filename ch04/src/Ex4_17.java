class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue; //3의배수인 경우 넘어감 
			System.out.println(i);
		}
	}
}