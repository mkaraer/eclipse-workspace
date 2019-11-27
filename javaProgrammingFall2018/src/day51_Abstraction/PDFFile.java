package day51_Abstraction;

public class PDFFile extends File{
	
	//how do i call File(String name)
	public PDFFile(String name) {
		super(name);
	}
	@Override
	public void open() {
		System.out.println("PDFFile is using Adobe Acrobat");
		
	}
	
	
	
	
	
	
	

}
