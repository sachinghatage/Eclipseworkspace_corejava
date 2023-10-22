package readingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        //provide full path till the text file
        //without using buffer reader
//        FileReader fileReader=new FileReader("D:\\file reader\\readfile.txt");
//        int i;
//        while((i=fileReader.read())!=-1){
//            System.out.print((char) i);
//        }

        //Using buffered reader
        FileReader fileReader=new FileReader("D:\\file reader\\readfile.txt");
        BufferedReader bufferReader=new BufferedReader(fileReader);
        int i;
        while((i=bufferReader.read())!=-1){
            System.out.println((char)i);
        }

    }
}
