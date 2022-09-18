package com.dey.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pmtId;
	private String pmtMethod;
	private double amount;
	private double paidAmount;
	private double balance;
	
	public Payment( String pmtMethod, double amount, double paidAmount, double balance) {
		super();
		//this.pmtId = pmtId;
		this.pmtMethod = pmtMethod;
		this.amount = amount;
		this.paidAmount = paidAmount;
		this.balance = balance;
		//this.cust = cust;
	//	this.room = room;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPmtId() {
		return pmtId;
	}
	public void setPmtId(Long pmtId) {
		this.pmtId = pmtId;
	}
	public String getPmtMethod() {
		return pmtMethod;
	}
	public void setPmtMethod(String pmtMethod) {
		this.pmtMethod = pmtMethod;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}*/
	@Override
	public String toString() {
		return "Payment [pmtId=" + pmtId + ", pmtMethod=" + pmtMethod + ", amount=" + amount + ", paidAmount="
				+ paidAmount + ", balance=" + balance + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, balance, paidAmount, pmtId, pmtMethod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Double.doubleToLongBits(paidAmount) == Double.doubleToLongBits(other.paidAmount)
				&& Objects.equals(pmtId, other.pmtId) && Objects.equals(pmtMethod, other.pmtMethod);
	}
	
	
	
	
}
