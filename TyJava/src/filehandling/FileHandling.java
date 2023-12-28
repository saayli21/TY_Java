package filehandling;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Sayali\\Desktop\\Java TY\\sample.txt");
		if(!file.exists()) {
			System.out.println("File is created");
			file.createNewFile();
		}
		else {
			System.out.println("File is already created");
		}
		//to write output
		
		FileOutputStream fos=new FileOutputStream(file);
		String s1="I live in Banglore\n";
		fos.write(s1.getBytes());
		String s2="I work in TYSS\n";
		fos.write(s2.getBytes());
		String s3="I am learning Java\n";
		fos.write(s3.getBytes());
		
		//to read output
		
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
			}
	  }
}
