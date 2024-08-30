package com.course.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity

public class Booking {
	@Id
	@GeneratedValue
	
	private int BookingId;
	private String name;
	private String email;
	private long mobile;
	@ManyToOne
	@JoinColumn(name = "Id")
	private Course course;
	private String confirmationId;
	
	public int getBookingId() {
		return BookingId;
	}
	public void setBookingId(int bookingId) {
		BookingId = bookingId;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getConfirmationId() {
		return confirmationId;
	}
	public void setConfirmationId(String confirmationId) {
		this.confirmationId = confirmationId;
	}
	public Booking(int bookingId, String name, String email, long mobile, Course course, String confirmationId) {
		super();
		BookingId = bookingId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.course = course;
		this.confirmationId = confirmationId;
	}
	
	public Booking() {}
	
}
