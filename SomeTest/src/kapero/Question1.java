package kapero;

public class Question1 {

	public static void main(String[] args) {
		System.out.println(sameNumberOfFactors(-6, 21));
		System.out.println(sameNumberOfFactors(6, 21));
		System.out.println(sameNumberOfFactors(8, 12));
		System.out.println(sameNumberOfFactors(23, 97));
		System.out.println(sameNumberOfFactors(0, 1));
		System.out.println(sameNumberOfFactors(0, 0));

	}

	public static int sameNumberOfFactors(int n1, int n2) {
		if (n1 < 0 || n2 < 0)
			return -1;
		if (n1 == n2)
			return 1;
		int countFactorN1 = 0;
		int countFactorN2 = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0)
				countFactorN1++;
		}
		for (int j = 1; j <= n2; j++) {
			if (n2 % j == 0)
				countFactorN2++;
		}
		if (countFactorN1 == countFactorN2)
			return 1;
		return 0;
	}
}
