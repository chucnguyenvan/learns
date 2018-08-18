package sinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable {
	private String Name;
	private String id;
	private int age;
	private float gpa;
	public SinhVien() {
		}
	public SinhVien(String name, String id, int age, float gpa) {
		Name = name;
		this.id = id;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
}
