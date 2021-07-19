package proxy;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		DogImp dogImp = new DogImp();
////		System.out.println(dogImp.getName());
////		dogImp.getProperty();

//		String[] strs = new String[]{"aaa","bbb","ccc"};
//		List<String> strings = Arrays.asList(strs);
//		//strings.add("dd");  “Ï≥£ java.lang.UnsupportedOperationException
//		strs[0] = "ddd";
//		System.out.println(strings.get(0));System.out.println(strings.get(1));

//		for (String string : strings) {
//			System.out.println(string);
//		}

		Pizza pizza = new Pizza();
		pizza.setStatus(Pizza.PizzaStatus.READY);
//		System.out.println(pizza.getStatus().isReady());
//		System.out.println(pizza.isDeliverable());
		System.out.println(Pizza.PizzaStatus.ORDERED.ordinal());
		System.out.println(Pizza.PizzaStatus.DELIVERED.ordinal());

	}


}


class Pizza {

	public PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(PizzaStatus status) {
		this.status = status;
	}

	private PizzaStatus status;


	public enum PizzaStatus {
		ORDERED (5){
			@Override
			public boolean isOrdered() {
				return true;
			}
		},
		READY (2){
			@Override
			public boolean isReady() {
				return true;
			}
		},
		DELIVERED (0){
			@Override
			public boolean isDelivered() {
				return true;
			}
		};

		private int timeToDelivery;

		public boolean isOrdered() {return false;}

		public boolean isReady() {return false;}

		public boolean isDelivered(){return false;}

		public int getTimeToDelivery() {
			return timeToDelivery;
		}

		PizzaStatus (int timeToDelivery) {
			this.timeToDelivery = timeToDelivery;
		}
	}

	public boolean isDeliverable() {
		return this.status.isReady();
	}

	public void printTimeToDeliver() {
		System.out.println("Time to delivery is " +
				this.getStatus().getTimeToDelivery());
	}

	// Methods that set and get the status variable.
}



