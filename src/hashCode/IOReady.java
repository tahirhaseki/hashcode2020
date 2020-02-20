package hashCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOReady {

	public static void ReadFile(String filename ) {
		String str;
		try {
			File file = new File("input.csv");
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((str = br.readLine()) != null) {

				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
