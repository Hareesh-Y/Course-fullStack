package com.course.entity;

import java.sql.Blob;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity

public class Course {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String courseName;
	private int coursePrice;
	private String courseDescription;
	@Lob
	@JsonIgnore
	private Blob photo;
	@Transient
	private String photoBase64;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getPhotoBase64() {
		return photoBase64;
	}
	public void setPhotoBase64(String photoBase64) {
		this.photoBase64 = photoBase64;
	}
	
	public Course(Integer id, String courseName, int coursePrice, String courseDescription, Blob photo,
			String photoBase64) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseDescription = courseDescription;
		this.photo = photo;
		this.photoBase64 = photoBase64;
	}
	
	public Course() {}
	
	
}
