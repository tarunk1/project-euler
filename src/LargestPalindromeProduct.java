public class LargestPalindromeProduct {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int num = getLargestPalindrome();
		System.out.println(num);
		System.out.println("Total time taken : "
				+ (System.currentTimeMillis() - startTime));
	}

	private static int getLargestPalindrome() {
		int maxNum = Integer.MIN_VALUE;

		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int num = i * j;
				if (isPalindrome(num)) {
					if (maxNum < num) {
						maxNum = num;
					}
				}
			}
		}

		return maxNum;
	}

	private static boolean isPalindrome(int num) {
		String str = String.valueOf(num);
		String reversedStr = new StringBuilder(str).reverse().toString();
		if (str.equals(reversedStr)) {
			return true;
		}
		return false;
	}
}
