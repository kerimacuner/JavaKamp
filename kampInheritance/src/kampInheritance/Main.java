package kampInheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer kerim = new IndividualCustomer();
		kerim.customerNumber = "123456";
		
		CorporateCustomer sirket = new CorporateCustomer();
		sirket.customerNumber = "456789";
		
		SendikaCustomer abc =  new SendikaCustomer();
		abc.customerNumber = "999999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(sirket);
		//customerManager.add(kerim);
		//customerManager.add(abc);
		
		Customer[] customers = {kerim,sirket,abc};
		
		customerManager.addMultiple(customers);
		
	}

}
