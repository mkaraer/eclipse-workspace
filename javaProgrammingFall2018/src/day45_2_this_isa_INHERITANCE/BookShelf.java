package day45_2_this_isa_INHERITANCE;

public class BookShelf {
	
	private String title;
	private String AuthorName;
	private int id;
	private int page;
	
	{
		System.out.println("dont forget to write the id ");
	}
	public BookShelf() {
		
	}
	
	public BookShelf( String title,String AuthorName, int id,int page) {
		
		this.title = title;
		AuthorName = AuthorName;
		this.id = id;
		this.page = page;
		
	}
	
	
	
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
