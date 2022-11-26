package filehandlingjava8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\ulla ulla\\Desktop\\File\\StringNote.txt");
		 
		 try {
			 // it is 1st way
			 
//			 BufferedReader r = new BufferedReader(new FileReader(file));
//			 String s1=null;
//			 while((s1=r.readLine())!=null){
//				 System.out.println(s1);}
			 
		
			 
			// it is 2nd way
			 
//			 FileInputStream f=new FileInputStream(file);
//			 int i=0;
//			 while((i=f.read())!=-1) {
//			 System.out.print((char)i);
//			 }
			 
			 
			// it is 3rd way
			 FileReader f=new FileReader(file);
			 int i=0;
			 while((i=f.read())!=-1) {
				 System.out.print((char)i);
			 }
			 
			 
		 }
		 catch(FileNotFoundException e) {
			 System.out.println(e);
			 
		 }
		
		
	}

}
