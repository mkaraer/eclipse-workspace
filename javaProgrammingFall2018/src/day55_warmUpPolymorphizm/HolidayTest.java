package day55_warmUpPolymorphizm;



public class HolidayTest {
	private static final Cristmas Holiday = null;

	public static void main(String[] args) {
		
	Holiday h1=new Cristmas();
	h1.sendHolidayMessage();
	Cristmas h2=(Cristmas) h1;
	h2.exchangeGifts();
	h2.doHolidayStaff(100);;
	
	h1=new NewYear();
	h1.sendHolidayMessage();
	NewYear n1=(NewYear) h1;
	n1.exchangeGifts();
	
	GiftReceiver g= new Cristmas();
	g.receiverGift();
	
	


	
	}
}
