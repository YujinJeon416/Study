class Ex5_8 {
	public static void main(String[] args) {
		int[][] score = {
				  { 100, 100, 100 }//score [0]
				, { 20, 20, 20 } //score[1]
				, { 30, 30, 30 } //score[2]
				, { 40, 40, 40 } //score[3]
		};
		int sum = 0;

		for (int i = 0; i < score.length; i++) { //길이 4
			for (int j = 0; j < score[i].length; j++) { //길이 3
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}//이중for문 외우기!!!
		}

		System.out.println("sum=" + sum);
	}
}