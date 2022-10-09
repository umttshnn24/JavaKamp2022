package youTubeDemo;

import youTubeDemo.business.CustomerManager;
import youTubeDemo.business.ICreditManager;
import youTubeDemo.business.MilitaryCreditManager;
import youTubeDemo.business.TeacherCreditManager;
import youTubeDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();

	}

}
