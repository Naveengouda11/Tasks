package interfacetask;

interface Printable {
	void print();
	
}
interface Scannable {
	void scan();
}

class MultifunctionPrinter implements Printable,Scannable {
	public void print() {
		System.out.println("Printing.... ");
	}
	public void scan() {
		System.out.println("Scanning.... ");
	}
}
public class Task3 {

	public static void main(String[] args) {
		MultifunctionPrinter minfo = new MultifunctionPrinter();
		minfo.print();
		minfo.scan();
		

	}

}
