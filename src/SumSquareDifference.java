public class SumSquareDifference {

	public static void main(String[] args) {
		long currentTs = System.currentTimeMillis();

		int num = 100;
		int sumOfSquares = getSumOfSquares(num);
		int squareOfSum = getSquareOfSum(num);
		System.out.println(Math.abs(sumOfSquares - squareOfSum));

		System.out.println("Total time taken : "
				+ (System.currentTimeMillis() - currentTs));
	}

	private static int getSquareOfSum(int num) {
		int sum = (num * (num + 1)) / 2;
		return sum * sum;
	}

	private static int getSumOfSquares(int num) {
		return (num * (num + 1) * (2 * num + 1)) / 6;
	}

}
