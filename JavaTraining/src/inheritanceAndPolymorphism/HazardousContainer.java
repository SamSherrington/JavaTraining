package inheritanceAndPolymorphism;

public class HazardousContainer extends Container{

	int imdgClass;
	String imdgCode;
	
	public HazardousContainer(String ctrNumber, String isoCode, int size, int imdgClass, String imdgCode) {
		super(ctrNumber, isoCode, size);
		this.imdgClass = imdgClass;
		this.imdgCode = imdgCode;
	}
	
	public void display() {
		
		System.out.println("==============");
		System.out.println("Hazardous container details:");
		super.display();
		System.out.println(" IMDG class: " + imdgClass + " IMDG code: " + imdgCode);
	}
	
}
