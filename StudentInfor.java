package sinhvien;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class StudentInfor {
	private static final String pathName = "C:\\Users\\Laptop88\\Desktop\\QLSV\\student.txt";

	public void write(List<SinhVien> svList) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(new File(pathName));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(svList);

			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();

			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally { 
				CloseStream(fos);
				CloseStream(oos);
			}
		}

	public List<SinhVien> read(){
		List<SinhVien> svList = new ArrayList<SinhVien>();
		FileInputStream fis= null;
		ObjectInputStream ois= null;
		File file = new File(pathName);
		try {
			fis = new FileInputStream(file);
			ois =new ObjectInputStream(fis);
			svList =(List<SinhVien>) ois.readObject();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseStream(ois);
			CloseStream(fis);
		}
		
		return svList;
		
	}
	
	
	private void CloseStream(ObjectOutputStream oos) {
		// TODO Auto-generated method stub
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void CloseStream(FileOutputStream fos) {
		// TODO Auto-generated method stub
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void CloseStream(InputStream is) {
		// TODO Auto-generated method stub
		if (is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	}
