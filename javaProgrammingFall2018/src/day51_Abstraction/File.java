package day51_Abstraction;

public abstract class File {
	
	private String name;
	public static int count;
	
	public File() {
		System.out.println("Files classs constructor");
		name="unknown";
		count++;}
	public File(String name) {
		System.out.println("file class 1 arg cosrtucter");
		this.name=name;
		count++;
		}
public abstract void open();
	
	public void close() {
		System.out.println("closing the file");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
//file is genereal idea . might have different tyoes of file.

//open is a abstract methid, we know what it does , but we dont know the mplimintation . ti is hidden
//Abstract method ..can be added to abstract classes . con not be added to normal(non-abstract)classes.

//will not have any method body

//public abstract void method1(String str);