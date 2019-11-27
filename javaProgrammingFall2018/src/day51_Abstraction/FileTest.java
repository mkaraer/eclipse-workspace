package day51_Abstraction;

public class FileTest {
public static void main(String[] args) {
	
	//File file1= new File();  will not work
	
	XLSFile xl=new XLSFile();
	xl.open();
	xl.close();
	JPGFile jpg=new JPGFile();
	jpg.open();
	jpg.close();
	
	xl.setName("TestData.xls");
	System.out.println(xl.getName());
	
	jpg.setName("event01.jpd");
	System.out.println(jpg.getName());
	
	System.out.println(File.count);
	System.out.println(JPGFile.count);
	System.out.println(XLSFile.count);
	
	PDFFile pdf=new PDFFile("agileBook.pdf");
	pdf.open();
	pdf.close();
	System.out.println(File.count);
	System.out.println(pdf.getName());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
