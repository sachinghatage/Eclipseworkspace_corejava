package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException{
		FileWriter fileWriter=new FileWriter("filename.txt");
		fileWriter.write("learning to write file with java");
		fileWriter.close();
		System.out.println("successfully wrote file");
	}

}
