package RailwayReservation;

public class Reservation {

	public void purchaseTicket(Customer customer, Destination destination) throws InterruptedException {

		if (destination.getNumberTickets() == 0 || customer.getCustomerAge() == 0) {
			System.out.println(customer.getCustomerName() + " age and number of tickets must be greater than 1");
			System.out.println("Cant get the ticket");
		} else if (customer.getCustomerAge() <= 5) {
			System.out.println(customer.getCustomerName() + " is eligible for half ticket.");
			double totalPrice = (destination.getTicketPrice() / 2) * destination.getNumberTickets();
			Thread.sleep(2000);
			System.out.println("Ticket reserved by " + customer.getCustomerName() + " from " + destination.getFrom()
					+ " to " + destination.getToGo() + " for USD " + totalPrice);
		} else {
			System.out.println(customer.getCustomerName() + " please you can go for transaction..");
			double totalPrice = destination.getTicketPrice() * destination.getNumberTickets();
			Thread.sleep(2000);
			System.out.println("Ticket reserved by " + customer.getCustomerName() + " from " + destination.getFrom()
					+ " to " + destination.getToGo() + " for USD " + totalPrice);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("==========Welcome to My Railway!..==========");
		System.out.println();
		Customer c1 = new Customer("Ansh", "Pune", 3, 818093271);
		Destination d1 = new Destination("London", "Paris", 340, 22);
		Reservation r1 = new Reservation();
		r1.purchaseTicket(c1, d1);

		System.out.println("--------------------------------------------------------");

		Customer c2 = new Customer("Nikhil", "Berlin", 33, 818093271);
		Destination d2 = new Destination("NY", "Chicago", 340, 7);
		Reservation r2 = new Reservation();
		r2.purchaseTicket(c2, d2);

		System.out.println("--------------------------------------------------------");
		Customer c3 = new Customer("Rohini", "Mumbai", 32, 874554569);
		Destination d3 = new Destination("KL", "Irbil", 550, 14);
		Reservation r3 = new Reservation();
		r3.purchaseTicket(c3, d3);
	}
}