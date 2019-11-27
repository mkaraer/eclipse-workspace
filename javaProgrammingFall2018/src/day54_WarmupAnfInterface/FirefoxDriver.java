package day54_WarmupAnfInterface;

import java.util.*;

public class FirefoxDriver implements WebDriver{
	public void setFirefoxOptions (List<String> options) {
		for (String option : options) {
			System.out.println("setting Firefox opetion "+option);
		}
				
		
	}

	@Override
	public void navigate(String url) {
		System.out.println("firefox url");
		
	}

	@Override
	public void open() {
		System.out.println("firefox open");
		
	}

	@Override
	public void close() {
		System.out.println("firefox close");
		
	}

	@Override
	public void quit() {
		System.out.println("firefox quit");
		
	}

}
