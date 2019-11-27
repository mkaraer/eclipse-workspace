package day45_static_block_INHERITANCE;

public class DefaultValues {

	public int intValue;
	public byte byeValue;
	public double doubleValue;
	public boolean boolenaValue;
	public char cahrValue;
	public String stringValue;
	public Integer integerObject;
	
	public void seller(int  value) {
		System.out.println("seleep"+value);
	}

	public static void main(String[] args) {

		DefaultValues d = new DefaultValues();
		System.out.println(d.intValue);
		System.out.println(d.doubleValue);
		System.out.println(d.boolenaValue);
		System.out.println(d.cahrValue);
		System.out.println(d.stringValue);
		System.out.println(d.integerObject);

	//	System.out.println(d.stringValue.toUpperCase());// java.lang.NullPointerException
		
		System.out.println(d.intValue+101);//101
		d.stringValue="Hello World";
		System.out.println(d.stringValue.toUpperCase());
		
		
		d.seller(23);
		

	}
}
