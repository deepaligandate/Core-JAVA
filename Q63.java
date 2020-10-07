package Assginment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OccuranceOf {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\cdac20\\dir\\text1.text");
		
		//checking file present or not
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		Boolean b = f.createNewFile();
		System.out.println(b);
		
	//========================================================
		//writing a file
		FileOutputStream f1 = new FileOutputStream("E:\\cdac20\\dir\\text1.text");
		String s = "Hello this is the file handling concept";
		for(int i=0;i<s.length();i++) {
			f1.write(s.charAt(i));
		}
		f1.close();
		System.out.println("Success");
		
	//=========================================================
		//reading the file
		FileInputStream f3 = 
				new FileInputStream("E:\\cdac20\\dir\\text1.text");
		int ch = -1;
		int count=0;
		while((ch = f3.read()) != -1) {
			if(ch == 't') {
				count++;
			}		
			
		}
		
		System.out.println("Occurance of 't' = "+count);
		f3.close();
		System.out.println("success");
	}

}
