package oopsTasks;

class Book {
	String title;
	String author;
	double price;
	
	void displayDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
}

public class Task1 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "Smart work can't beat hardwork";
		b1.author = "William";
		b1.price = 999.9;
		
		Book b2 = new Book();
		b2.title = "Money Can't by happieness";
		b2.author = "Eminem";
		b2.price = 1999.25;
		b1.displayDetails();
		b2.displayDetails();
		

	}

}
