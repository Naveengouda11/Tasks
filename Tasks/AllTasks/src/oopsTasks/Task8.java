package oopsTasks;

abstract class Appliances {
	abstract void turnOn();
}
interface Connectable {
	 void connect();
}
class SmartTV extends Appliances implements Connectable{
	void turnOn() {
		System.out.println("SmartTv is On");
	}

	public void connect() {
		System.out.println("SmartTv is connected to internet");
		
	}
}

public class Task8 {

	public static void main(String[] args) {
		SmartTV sm = new SmartTV();
		sm.turnOn();
		sm.connect();

	}

}
