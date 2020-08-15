package Book;


public class BookController {

	Book b;
	BookView view;
	 
	 BookController(Book b, BookView view){
		 this.b = b;
		 this.view = view;
	 }
	 public void setTitle(String title) {
		 b.setTitle(title);
	 }
	 public void setPrice(double price) {
		 b.setPrice(price);
	 }
	 public void setAuthor(Author a) {
		 b.setMyAuthor(a);
	 }
	 public double getPrice() {
		 return b.getPrice();
	 }
	 public String getTitle() {
		 return  b.getTitle();
	 }
	 public Author getAuthor() {
		 return b.getMyAuthor();
	 }
	 
}
