package SOLID.SingleResponsibilityPrinciple;

public class Main {

	public static void main(String[] args) throws Exception {
		Journal journal = new Journal();
		journal.addEntry("I cried today");
		journal.addEntry("I ate a bug");
		System.out.println(journal);

		Persistence persistence = new Persistence();
		String fileName = "C:\\Users\\rapus\\Documents\\journal.txt";
		persistence.saveToFile(journal,fileName,true);
		Runtime.getRuntime().exec("notepad.exe "+fileName);
	}

}
