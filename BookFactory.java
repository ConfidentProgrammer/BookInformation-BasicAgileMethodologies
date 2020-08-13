package Book;

import java.util.ArrayList;

public class BookFactory {
         ArrayList<Book> BookObjects = new ArrayList<>();
   public Book makeBook(String bookType) {
	   if(bookType.equals("Near Dark")) {
		   BookObjects.add(new Book("Near dark"));
		   return BookObjects.get(0);
	   }else if(bookType.equals("BackLash")) {
		   BookObjects.add(new Book("Back Lash"));
		   return BookObjects.get(1);
	   }else if(bookType.equals("The Lions of Lucerne")) {
		   BookObjects.add(new Book("The Lions of Lucerne"));
		   return BookObjects.get(2);
	   }else if(bookType.equals("Spy Master")) {
		   BookObjects.add(new Book("Spy Master"));
		   return BookObjects.get(3);
	   }else if(bookType.equals("Path of the Assassin")) {
		   BookObjects.add(new Book("Path of the Assassin"));
		   return BookObjects.get(4);
	   }
	   
	   return null;
   }
	
}
