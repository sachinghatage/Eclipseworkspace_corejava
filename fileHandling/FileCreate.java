package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException{

		File file=new File("D:\\filename.txt");
		if(file.createNewFile()) {
			System.out.println("file created " +file.getName());
		}else {
			System.out.println("file already exists");
		}
	}

}
