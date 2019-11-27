package day54_WarmupAnfInterface;

public class testDriver {
public static void main(String[] args) {
	
	WebDriver driver1=new ChoromeDriver();
	
	driver1.navigate("www.google.com");
	driver1.open();
	driver1.quit();
	
WebDriver driver2=new FirefoxDriver();
	
	driver2.navigate("www.google.com");
	driver2.open();
	driver2.quit();
WebDriver driver3=new ChoromeDriver();
	
	driver3.navigate("www.google.com");
	driver3.open();
	driver3.quit();
System.out.println("//////////");	
	
WebDriver[] drivers= {driver1,driver2,driver3};

	//WebDriver[] drivers= {new ChoromeDriver(),
	                   //     new FirefoxDriver(),
			           //   new ChoromeDriver()	};	
	for (WebDriver driver : drivers) {
		driver.navigate("www.google.com");
		driver.open();
		driver.quit();
		
		System.out.println("..................");
	}
	

}
}
