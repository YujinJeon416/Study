class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		System.out.println(str.charAt(0) - '0'); //3
		System.out.println('3' - '0' + 1); //4
		System.out.println(Integer.parseInt("3") + 1); //4
		System.out.println("3" + 1);//31
		System.out.println(3 + '0');   // '0'은 숫자로 48
	}
}