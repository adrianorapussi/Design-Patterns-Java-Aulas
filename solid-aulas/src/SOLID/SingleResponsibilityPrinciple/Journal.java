package SOLID.SingleResponsibilityPrinciple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

	private final List<String> entries = new ArrayList<>();
	private static int count = 0;

	public void addEntry(String newText) {
		entries.add("" + (++count) + ": "+newText);
	}

	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	//--------------------------------------
	// This block breaks the Single Responsibility Principle, because it adds
	// the responsibility to the entity for saving a file
	public void save(String fileName) throws FileNotFoundException {
		try(PrintStream out = new PrintStream(fileName)){
			out.println(toString());
		}
	}

	public void load(String fileName) {}
	public void load(URL url) {}
	//--------------------------------------
}
