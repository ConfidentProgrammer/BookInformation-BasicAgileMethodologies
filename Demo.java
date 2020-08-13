package Book;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//making authors
		AuthorFactory firstAuthor = new AuthorFactory(); 
	Author a = firstAuthor.makingAuthor("Brad Thor"); //this is the whole author
	a.setPublisherName("MannLund Shah");	
	// Making Books
	BookFactory firstBook = new BookFactory();	
	Book b1 = firstBook.makeBook("Near Dark");
	
	//Now setting the author to Book1
	
	b1.setMyAuthor(a);
	b1.setPrice(14.99);
	b1.setTitle("Near Dark");
	//System.out.println();
	System.out.println(a.getPublisherName());
	System.out.println(b1.getPrice());
	}

}
