package interfacetask;

interface RemoteControl {
	abstract void turnOn();
	
	default void batteryStatus() {
		System.out.println("Battery is 66%");
	}
}
class TV implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Charge is there turn on the TV.");
		
	}
	
}

public class Task1 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		tv.batteryStatus();
		tv.turnOn();

	}

}
