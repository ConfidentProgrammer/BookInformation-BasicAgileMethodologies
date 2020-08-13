package Book;

public class Book {
     
	Author myAuthor;
	String title;
	double price;
	
	//member functions
	Book(String title){
	   this.title = title;
	}
	public Author getMyAuthor() {
		return myAuthor;
	}
	public void setMyAuthor(Author myAuthor) {
		this.myAuthor = myAuthor;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
