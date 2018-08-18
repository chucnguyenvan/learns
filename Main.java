package sinhvien;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager studentManager = new StudentManager();
		int choose=0;
		do {
			showMenu();
			choose = scanner.nextInt();
			switch (choose) {
			case 1:
				studentManager.add();
				break;
				case 2 :
				studentManager.show();
				break;
//			case 3 :
//				studentId = studentManager.inputId();
//				studentManager.edit(studentId);
//				break;
//			case 4 :
//				studentId = studentManager.inputId();
//				studentManager.delete(studentId);
//				break;
//			case 5 :
//				studentManager.sortStudentByGPA();
//				break;
//			case 6 :
//				studentManager.sortStudentByName();
//				break;

			default:
				System.out.println("invalid! please choose action in below menu:");
				break;
			}
		}while (choose!=7);
			
		
	}

	/**
	 * create menu
	 */
	public static void showMenu() {
		System.out.println("-----------menu------------");
		System.out.println("1. Add student.");
		System.out.println("2. Show student. ");
		System.out.println("3. Edit student by id.");
		System.out.println("4. Delete student by id.");
		System.out.println("5. Sort student by gpa.");
		System.out.println("6. Sort student by name.");
		System.out.println("0. exit.");
		System.out.println("---------------------------");
		System.out.print("Please choose: ");
	}

}
