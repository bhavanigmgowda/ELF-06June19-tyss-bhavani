package assignmentday2;

import java.io.*;
import java.util.*;

public class ReadWriteToFile {

public static void main(String args[]) {        
    try {
        FileInputStream fin=new FileInputStream("myEx1.txt");
     	int i;
     	String s="";
        while((i=fin.read())!=-1) {
            s=s+String.valueOf((char)i);
            }
            FileOutputStream fout=new FileOutputStream("ex.txt");
   			//BufferedWriter b=new BufferedWriter(fout);
   			//ByteStream b=new ByteStream(fout);
   			 byte[] b = s.getBytes();
   			fout.write(b);
   			fout.close();
    }		
    catch(FileNotFoundException e) {
        System.err.println("File not found. Please scan in new file.");
    }
   
    catch(Exception i) {
        System.err.println("File not found. Please scan in new file.");
    }
}
}