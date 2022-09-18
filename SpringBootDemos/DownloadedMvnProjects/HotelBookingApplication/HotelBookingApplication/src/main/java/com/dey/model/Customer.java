package com.dey.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long custId;
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	private Date checkInDate;
	private Date checkOutDate;
	@OneToOne
	private Room room;
	@OneToOne(cascade=CascadeType.ALL)
	private Payment pmt1;
	
	public Customer( String name, String email, String phoneNo, String address, Date checkInDate,
			Date checkOutDate, Room room, Payment pmt1) {
		super();
		//this.custId = custId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.room = room;
		this.pmt1 = pmt1;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	public Payment getPmt1() {
		return pmt1;
	}

	public void setPmt(Payment pmt1) {
		this.pmt1 = pmt1;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", room="
				+ room + ", pmt1=" + pmt1 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, checkInDate, checkOutDate, custId, email, name, phoneNo, pmt1, room);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(checkInDate, other.checkInDate)
				&& Objects.equals(checkOutDate, other.checkOutDate) && Objects.equals(custId, other.custId)
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNo, other.phoneNo) && Objects.equals(pmt1, other.pmt1)
				&& Objects.equals(room, other.room);
	}

	
	
}
