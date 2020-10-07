package Assginment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) throws IOException {
		FileReader f = 
				new FileReader("E:\\cdac20\\dir\\text1.text");
		BufferedReader b = new BufferedReader(f);
		String s ;
		String[] words = null;
		int wc = 0;
		while((s=b.readLine())!=null) {
		words = s.split(" ");
		wc = wc + words.length;
		}
		b.close();
		f.close();
		System.out.println("Number of words in the file: "+wc);
	
	}
}