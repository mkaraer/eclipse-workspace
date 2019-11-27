package day45_2_this_isa_INHERITANCE;

public class BookShelfTester {
public static void main(String[] args) {
	
	BookShelf book1=new BookShelf();
	
	book1.setAuthorName("sherlock holmes");
	book1.setId(12);
	book1.setPage(120);
	book1.setTitle("sniper");
	
	
	BookShelf book2=new BookShelf("hilal","superman",34,24);
	System.out.println(book2.getAuthorName());
	
	
	
	
	
	
	
	
	
	
}
}
