package com.dey.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.dey.model.Customer;
@Entity
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long roomNo;
	private String roomType;
	private String noOfBeds;
	private boolean status;
	
	
	
	public Room( String roomType, String noOfBeds, boolean status) {
		super();
		//this.roomNo = roomNo;
		this.roomType = roomType;
		this.noOfBeds = noOfBeds;
		this.status = status;
		//this.cust = cust;
		//this.pmt = pmt;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*public Payment getPmt() {
		return pmt;
	}
	public void setPmt(Payment pmt) {
		this.pmt = pmt;
	}*/
	public Long getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Long roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getNoOfBeds() {
		return noOfBeds;
	}
	public void setNoOfBeds(String noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
/*	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	*/
	@Override
	public int hashCode() {
		return Objects.hash(noOfBeds, roomNo, roomType, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(noOfBeds, other.noOfBeds) && Objects.equals(roomNo, other.roomNo)
				&& Objects.equals(roomType, other.roomType) && status == other.status;
	}
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", roomType=" + roomType + ", noOfBeds=" + noOfBeds + ", status=" + status
				+ "]";
	}
	
	
	
	
	
}
