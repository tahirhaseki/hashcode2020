package hashCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int countter = 1;
		//for(int countter = 1;countter < 7;countter++) {
		String str = "";
		String[] splitted = null;
		try {
			File file = new File(countter+".txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			str = br.readLine();
			splitted = str.split(" ");
			// str0 kadar book create et.
			Book[] books = new Book[Integer.parseInt(splitted[0])];
			// str1 kadar library create et.
			Library[] libraries = new Library[Integer.parseInt(splitted[1])];
			int day = Integer.parseInt(splitted[2]);
			str = br.readLine();
			splitted = str.split(" ");
			for(int i = 0;i < books.length;i++) {
				books[i] = new Book(Integer.parseInt(splitted[i]));
			}
			for(int i = 0;i < libraries.length;i++) {
				str = br.readLine();
				splitted = str.split(" ");
				libraries[i] = new Library(Integer.parseInt(splitted[0]),Integer.parseInt(splitted[1]),Integer.parseInt(splitted[2]));
				str = br.readLine();
				splitted = str.split(" ");
				for(int j = 0;j < libraries[i].books.length;j++) {
					libraries[i].addBook(books[Integer.parseInt(splitted[j])]);
				}
				libraries[i].calcuateProfit();
			}
			Arrays.sort(libraries);
			try {
				FileWriter myWriter = new FileWriter("OUTPUT_"+countter+".txt");
				String output = "";
				int signedLibraryCount=0;
				for(int i = 0;i < libraries.length;i++) {
			    	if(day >= libraries[i].total_day) {
			    		signedLibraryCount++;
			    		output += libraries[i].ID + " " + libraries[i].book_counter+"\n";
			    		for(int j = 0;j < libraries[i].books.length;j++) {
			    			// BOÞLUK KONTROL EDÝLEBÝLÝR
			    			output += libraries[i].books[j].ID + " ";
			    		}
			    		output += "\n";
			    	}
			    	else if(day <= libraries[i].sign_time){
			    		continue;
			    	}
			    	else {
			    		signedLibraryCount++;
			    		int bookCount=  (day - libraries[i].sign_time) * libraries[i].scanper_day;
			    		output += libraries[i].ID + " " +bookCount+"\n";
		    			Arrays.sort(libraries[i].books);
		    			for(int j = 0;j < bookCount;j++) {
		    				output += libraries[i].books[j].ID + " ";
		    			}
		    			output += "\n";
			    	}
			        day -= libraries[i].sign_time;
			        if(day == 0)
			        	break;
				}
				myWriter.write(signedLibraryCount+"\n"+output);
				myWriter.close();
			} catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ended");
		//}
	}
	
	

}
