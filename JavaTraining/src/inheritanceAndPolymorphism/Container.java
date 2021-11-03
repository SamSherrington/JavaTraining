package inheritanceAndPolymorphism;

public class Container {
	
	String ctrNumber;
	String isoCode;
	int size;
	
	public Container(String ctrNumber, String isoCode, int size) {
		super();
		this.ctrNumber = ctrNumber;
		this.isoCode = isoCode;
		this.size = size;
	}
	
	public void display() {
		
		System.out.println("Container number: " + ctrNumber + " ISO code: " + isoCode + " Size: " + size);
	}
	
	

}
