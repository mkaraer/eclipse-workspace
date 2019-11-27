package day47_INHERITANCEIntro;

public class CarMax  {
public static void main(String[] args) {
	

	//create object of veichle class
	//instansiation of vichle class
	
	Vehicle vehicle =new Vehicle();
	vehicle.makeAndModel="Subaru putback";
	vehicle.year=2018;
	vehicle.maxSpeed=140;
	vehicle.maxSpeed=200;
	vehicle.mileage=123;
	vehicle.drive();
	vehicle.stop(); 
	
	vehicle.service();
	// everthing is also available for for vehicle
	Car car= new Car();
	car.makeAndModel="toyota prius";
	car.year=2015;
	car.maxSpeed=120;
	
	car.drive();
	car.stop();
	car.hoursePower=123;
	car.service();
 car.doUber();

Train train= new Train();

train.maxSpeed=40;
System.out.println(train.maxSpeed);
train.mileage=25;

train.station();
train.stop();

ElectricCar tesla= new ElectricCar();
tesla.makeAndModel="tesla model";
tesla.year=2015;
tesla.maxSpeed=200;
tesla.hoursePower=518;
tesla.mileage=54312;
tesla.service();
tesla.doUber();
tesla.stop();

tesla.charge();
System.out.println("has a battery "+ElectricCar.hasBattery);

System.out.println("......static..........");
Car.service();
Vehicle.service();
ElectricCar.service();

tesla.








	
	
	
	
	
}	
	
}
