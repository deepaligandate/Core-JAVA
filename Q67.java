package Assginment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadShoppData {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file1=new FileInputStream("E:\\cdac20\\dir\\Shopping.txt");
	    
	       ObjectInputStream obj1=new ObjectInputStream(file1);
	  
	        Shopping shop=(Shopping)obj1.readObject();
	        System.out.println(shop);
	        
	       obj1.close();
	       System.out.println("Successfully read Data from Shopping.dat file");
	       file1.close();
		}
	}