package day54_WarmupAnfInterface;

public interface WebDriver  {
	
	public void navigate(String url);
	public void open();
	public void close();
    default void quit() {
    	System.out.println("default method");
    }
	

}
