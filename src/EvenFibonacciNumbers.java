public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int maxNum = 4000000;
		long sum = 2; // num2 is even

		int num1 = 1, num2 = 2;
		while (num1 + num2 <= maxNum) {
			int num3 = num1 + num2;
			if (num3 % 2 == 0) {
				sum += num3;
			}
			num1 = num2;
			num2 = num3;
		}

		System.out.println(sum);
		System.out.println("Total time taken : "
				+ (System.currentTimeMillis() - startTime) + "ms");
	}
}
