
public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		long currentTs = System.currentTimeMillis();
		
		int tripletSum = 1000;
		for (int i = 1; i < tripletSum; i++) {
			for (int j = i+1; j < tripletSum; j++) {
				for (int k = j+1; k < tripletSum; k++) {
					if (i + j + k != tripletSum) {
						continue;
					}
					if (i * i + j * j == k * k) {
						System.out.println(i * j * k);
					}
				}
			}
		}
		
		System.out.println("Total time taken : " + (System.currentTimeMillis() - currentTs));
	}
}
