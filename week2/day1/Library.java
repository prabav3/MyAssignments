package week2.day1;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println(bookTitle+" "+"Book added Successfully"); 
		return bookTitle;
		
		
	}
	
	public void issueBook() {
		System.out.println("Book issued Successfully"); 
	}

	public static void main(String[] args) {
		
	      Library book1 = new Library();
	      book1.addBook("Harry Potter");
	      
	      Library book2 = new Library();
	      book2.issueBook();
	      
	      

	}

}