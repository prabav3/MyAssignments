package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {

		Library book1 = new Library();
		book1.addBook("Ponniyin Selvan");
		
		Library book2 = new Library();
		book2.issueBook();
	}

}