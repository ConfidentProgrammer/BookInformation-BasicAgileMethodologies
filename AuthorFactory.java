package Book;

public class AuthorFactory {
 Author a = new Author("Brad Thor");
	public Author makingAuthor(String name) {
		 if(name.equals("Brad Thor")) {
			 return a;
		 }
		 return null;
	}
	
}
