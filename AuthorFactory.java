package Book;

public class AuthorFactory {
	
	//making the singleton 
	AuthorFactory obj;
	
	private AuthorFactory() {
		
		public AuthorFactory getInstance() {
			if(obj == null ) {
				obj = new AuthorFactory();
				
			}
			return obj;
		}
		
	}
	
	//This si the Implemenatation of the Factroy design pattern Deep patel
 Author a = new Author("Brad Thor");
	public Author makingAuthor(String name) {
		 if(name.equals("Brad Thor")) {
			 return a;
		 }
		 return null;
	}
	
}
