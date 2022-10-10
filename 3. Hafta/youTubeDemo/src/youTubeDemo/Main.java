package youTubeDemo;

import youTubeDemo.business.CustomerManager;
import youTubeDemo.business.ICreditManager;
import youTubeDemo.business.MilitaryCreditManager;
import youTubeDemo.business.TeacherCreditManager;
import youTubeDemo.entities.Customer;

public class Main {
	/*
	 * Değer ve Referans Tip int sayi1 =10; int sayi2=20; sayi1 =sayi2; sayi2=100;
	 * System.out.println(sayi1);
	 * 
	 * int[] sayilar1 ={10,20,30}; int[] sayilar2 ={1,2,3}; sayilar1 = sayilar2;
	 * sayilar2[0] =1000; System.out.println(sayilar1[0]);
	 */



	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();

	}

}
