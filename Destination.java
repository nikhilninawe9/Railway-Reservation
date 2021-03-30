
package RailwayReservation;

public class Destination {

	private String toGo;
	private String from;
	private double ticketPrice;
	private int numberTickets;

	public Destination(String toGo, String from, double ticketPrice, int numberTickets) {
		super();
		this.toGo = toGo;
		this.from = from;
		this.ticketPrice = ticketPrice;
		this.numberTickets = numberTickets;
	}

	public Destination() {
		super();
	}

	public String getToGo() {
		return toGo;
	}

	public void setToGo(String toGo) {
		this.toGo = toGo;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberTickets() {
		return numberTickets;
	}

	@Override
	public String toString() {
		return "Destination [toGo=" + toGo + ", from=" + from + ", ticketPrice=" + ticketPrice + ", numberTickets="
				+ numberTickets + "]";
	}

	public void setNumberTickets(int numberTickets) {
		this.numberTickets = numberTickets;
	}

}
