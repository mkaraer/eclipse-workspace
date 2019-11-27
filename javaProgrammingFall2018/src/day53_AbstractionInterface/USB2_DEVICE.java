package day53_AbstractionInterface;

public interface USB2_DEVICE {

	void plugin();
	void transferData();
	
	
public interface USB3_DEVICE extends USB2_DEVICE{

	void transferData_Faster();
	
	//void plugin();  with extends we van inharite
	//void transferData();

}}