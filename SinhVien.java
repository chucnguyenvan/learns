package sinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable {
	private String Name;
	private String id;
	private int age;
	private String address;
	private float gpa;
	public SinhVien() {
		}
	public SinhVien(String name, String id, int age, String address, float gpa) {
		Name = name;
		this.id = id;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
}
