package lab5_1;

import java.util.GregorianCalendar;

public class Order {
	private int orderNO;
	private GregorianCalendar orderDate;
	private double orderAmount;
	private Commissioned commissioned;

	public Order(int no, GregorianCalendar date, double amount, Commissioned c) {
		this.orderNO = no;
		this.orderDate = date;
		this.orderAmount = amount;
		this.commissioned=c;
	}

	public Commissioned getCommissioned() {
		return commissioned;
	}

	public void setCommissioned(Commissioned commissioned) {
		this.commissioned = commissioned;
	}

	public int getOrderNO() {
		return orderNO;
	}

	public void setOrderNO(int orderNO) {
		this.orderNO = orderNO;
	}

	public GregorianCalendar getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(GregorianCalendar orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}
