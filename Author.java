package Book;

public class Author extends Person{
    String publisherName;
    
    Author(String name){
    	super(name);
    }
	 Author(String pub,String name, String email, String gender){
		 super(name,email,gender);
		 pub = this.publisherName;
	 }
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	 
}
