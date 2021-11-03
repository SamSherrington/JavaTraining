package inheritanceAndPolymorphism;

public class ContainerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Container c = new Container("OOCG21", "20TO", 20);
		c.display();
		
		ReeferContainer r = new ReeferContainer("ONLR45", "40RH", 40, "FREEZER");
		r.display();
		
		HazardousContainer h = new HazardousContainer("PONH87", " 45EU", 45, 123, "DAN");
		h.display();

	}

}
