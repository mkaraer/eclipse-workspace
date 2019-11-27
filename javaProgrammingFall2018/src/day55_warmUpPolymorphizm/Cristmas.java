package day55_warmUpPolymorphizm;

public class Cristmas extends Holiday implements GiftReceiver {
int giftCount=1;

@Override
	public void sendHolidayMessage() {
		System.out.println("happy holiday");
	}
	public void exchangeGifts() {
		System.out.println("Exchange gift "+giftCount);
	}
	@Override
	public void doHolidayStaff(int param) {
		
		super.doHolidayStaff(param);
		System.out.println("from param"+param);
	}
	@Override
	public void receiverGift() {
		System.out.println("Receive gift");
		
	}
	
}
