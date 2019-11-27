package day45_2_this_isa_INHERITANCE;
/**
 * template class for messages
 * @author Yolcu
 *
 *///this()..assigngn and call other sonstructer
//this() can only be used inside constructors to call other constructors.
// it cannot be used inside the method.
// this() must be first statement in the constructor and you can only have 1 inthe constructer.

public class MessageThis {

	private String body;
	private String sender;
	private String receiver;
	
	
	public MessageThis(String body, String sender, String receiver) {
		
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public String toString() {
		return "Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
	}
	
	// overload the constructer
	public MessageThis(String body){
		this(body,"unkown","unknown");
//		this.body = body;
//		this.sender = "unknown";
//		this.receiver = "unknown";
	}
	// overload the constructer
	public MessageThis(String body, String receiver) {
		this(body,"unknown",receiver);
//		    this.body = body;
//			this.sender = "unknown";
//			this.receiver = receiver;
	}
	public MessageThis() {
		this("","unkown","unkown");
		
//		this.body = "";
//		this.sender = "unknown";
//		this.receiver = receiver;
}
	
	
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
	
	
	
}
