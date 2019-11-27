package day54_WarmupAnfInterface;

public class ChoromeDriver implements WebDriver{
	
public void setChoromeOptions(String [] options) {
	for (String option : options) {
		System.out.println("setting Choreme opetion "+option);
	}
}

@Override
public void navigate(String url) {
	System.out.println("choremedriver url"+url);
}

@Override
public void open() {
	System.out.println("choremedriver open");
	
}

@Override
public void close() {
	System.out.println("choremedriver close");
	
}

@Override
public void quit() {
	System.out.println("choremedriver quit");
	
}




}
