package sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	private StudentInfor stInfor;
    public static Scanner scanner = new Scanner(System.in);
    private List<SinhVien> stList;
	
	public StudentManager(StudentInfor stInfor, List<SinhVien> stList) {
		super();
		this.stInfor = stInfor;
		this.stList = stList;
	}


	public StudentManager() {
	}


	public void add() {
		SinhVien sv =new SinhVien();
		String name;
		System.out.println("NHAP NAME SINH VIEN");
		name=scanner.next();
		sv.getName();
		
		String id;
		System.out.println("NHAP MSSV SINH VIEN");
		id=scanner.next();
		sv.getId();
		
		int age;
		System.out.println("NHAP TUOI SINH VIEN");
		age = scanner.nextInt();
		sv.setAge(age);

		float pt;
		System.out.println("NHAP DIEM SINH VIEN");
		pt=scanner.nextFloat();
		sv.setGpa(pt);
		stList.add(sv);
		stInfor.write(stList);
	}
	public void show() {
		for (SinhVien sinhvien : stList) {
		System.out.println("Ten SV\t: "+sinhvien.getName());
		System.out.println("MSSV SV\t: "+sinhvien.getId());
		System.out.println("Tuoi SV\t: "+sinhvien.getAge());
		System.out.println("DIENTB\t: "+sinhvien.getGpa());
		}
		
	}
}
