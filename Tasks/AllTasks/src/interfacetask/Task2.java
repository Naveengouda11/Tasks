package interfacetask;

interface info {
	static void RemoteControl() {
		System.out.println("Static methos in interface");
	}
}
public class Task2 {

	public static void main(String[] args) {
		
		info.RemoteControl();
	}

}
