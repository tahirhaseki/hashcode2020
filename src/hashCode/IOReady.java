package hashCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOReady {

	public static void ReadFile(String filename ) {
		String str;
		try {
			File file = new File(filename);
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((str = br.readLine()) != null) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile() {
	    try {
	        FileWriter myWriter = new FileWriter("filename.txt");
	        myWriter.write("Files in Java might be tricky, but it is fun enough!");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}
