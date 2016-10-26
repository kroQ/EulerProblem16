public class TheAnswer {
	public static void main(String[] args) {

		int[] tablica = new int[302]; // pocz¹tkowo dalem 350 elementow
		tablica[0] = 1;
		TheAnswer answer = new TheAnswer();

		answer.Calculate(tablica);
		System.out.println("suma: " + answer.SumOfTab(tablica));
	}

	void Calculate(int tab[]) {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < tab.length; j++) {

				if (j != 0) {
					if (tab[j - 1] > 9) { //przenoszenie dziesiatek na kolejne miejsca
							tab[j] *= 2;
							tab[j]++;
							tab[j - 1] %= 10;
							continue;
					}
				}

				tab[j] *= 2;
			}
		}
	}

	int SumOfTab(int tab[]) {
		int sum = 0;
		for (int i : tab) {
			sum += i;
		}
		return sum;
	}
}
