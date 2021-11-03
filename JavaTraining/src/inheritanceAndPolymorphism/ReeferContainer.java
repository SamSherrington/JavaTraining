package inheritanceAndPolymorphism;

public class ReeferContainer extends Container {

	String coolingUnitName;

	public ReeferContainer(String ctrNumber, String isoCode, int size, String coolingUnitName) {
		super(ctrNumber, isoCode, size);
		this.coolingUnitName = coolingUnitName;
	}
	
	public void display() {
		
		System.out.println("===============");
		System.out.println("Reefer container details: ");
		super.display();
		System.out.println(" Cooling unit name: " + coolingUnitName);
	}
	
}
