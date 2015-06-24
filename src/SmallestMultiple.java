import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SmallestMultiple {

	public static void main(String[] args) {
		long currentTs = System.currentTimeMillis();

		int n = 20;
		int lcm = getLCM(n);
		System.out.println(lcm);

		System.out.println("Total time taken : "
				+ (System.currentTimeMillis() - currentTs));
	}

	private static int getLCM(int n) {
		Map<Integer, Integer> lcmFacts = new HashMap<Integer, Integer>();

		for (int i = 2; i <= n; i++) {
			Map<Integer, Integer> facts = getPrimeFactors(i);
			getLcmFacts(lcmFacts, facts);
		}

		int lcm = 1;
		for (Entry<Integer, Integer> e : lcmFacts.entrySet()) {
			int factNum = e.getKey();
			int factCount = e.getValue();
			for (int count = 0; count < factCount; count++) {
				lcm *= factNum;
			}
		}
		return lcm;
	}

	private static Map<Integer, Integer> getPrimeFactors(int num) {
		Map<Integer, Integer> facts = new HashMap<Integer, Integer>();

		while (num > 1) {
			int count = 0;
			if (num % 2 == 0) {
				while (num % 2 == 0) {
					num /= 2;
					count++;
				}
				facts.put(2, count);
			}

			for (int i = 3; i <= num; i += 2) {
				count = 0;
				if (num % i == 0) {
					while (num % i == 0) {
						num /= i;
						count++;
					}
					facts.put(i, count);
				}
			}
		}

		return facts;
	}

	private static void getLcmFacts(Map<Integer, Integer> lcmFacts,
			Map<Integer, Integer> facts) {

		for (Entry<Integer, Integer> e : facts.entrySet()) {
			if (!lcmFacts.containsKey(e.getKey())) {
				lcmFacts.put(e.getKey(), e.getValue());
			} else {
				if (lcmFacts.get(e.getKey()) < e.getValue()) {
					lcmFacts.put(e.getKey(), e.getValue());
				}
			}
		}
	}

}
