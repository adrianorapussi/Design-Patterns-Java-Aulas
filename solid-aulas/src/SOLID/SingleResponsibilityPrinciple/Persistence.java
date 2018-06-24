package SOLID.SingleResponsibilityPrinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

	public void saveToFile(Journal journal, String fileName,boolean overwrite) throws FileNotFoundException {
		if (overwrite || new File(fileName).exists()) {
			try(PrintStream out = new PrintStream(fileName)){
				out.println(journal.toString());
			}
		}
	}

	public void load(String fileName) {}
	public void load(URL url) {}

}
