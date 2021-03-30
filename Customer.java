package RailwayReservation;

public class Customer {

	private String customerName;
	private String customerAddress;
	private int customerAge;
	private long customerMobile;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public long getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerAge="
				+ customerAge + ", customerMobile=" + customerMobile + "]";
	}

	public Customer(String customerName, String customerAddress, int customerAge, long customerMobile) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerAge = customerAge;
		this.customerMobile = customerMobile;
	}

	public Customer() {
		super();
	}

}
