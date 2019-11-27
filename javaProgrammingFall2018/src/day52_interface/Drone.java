package day52_interface;

public class Drone implements Moveable,Flyable {
int engineSize;
int maxHeight;

@Override
public void move() {
	System.out.println("Move from Drone");
	}

@Override
public void moveIt() {
	System.out.println("Move it");
}


public static void main(String[] args) {
	
Drone d=new Drone();
d.move();
d.moveIt();
d.fly();

System.out.println(Flyable.Max);

}

@Override
public void fly() {
	System.out.println("Drone is flying");
	
}}