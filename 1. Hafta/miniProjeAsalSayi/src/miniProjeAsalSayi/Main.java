package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 0;

		Boolean asalMi = true;
		
		if(number<1) {
			System.out.println("Geçersiz bir sayı girdiniz.");
			return;
		}
		
		if(number==1) {
			System.out.println(number+" sayısı asal değildir.");
			return;
		}
		
		
			

		for (int i = 2; i < number; i++) {
			int kalan = number % i;
			if (kalan == 0) {
				asalMi = false;
			}
		}
		if (asalMi) {
			System.out.println(number+" sayısı asal sayıdır.");
		} else
			System.out.println(number+" sayısı asal değildir.");

	}

}