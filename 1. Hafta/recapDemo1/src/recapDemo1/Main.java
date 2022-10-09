package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 30;
		int sayi2 = 40;
		int sayi3 = 3;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En Büyük = "+enBuyuk);

	}

}