
public class PencilMainDriverClass {
	public static void main(String[] args) {
		
		Pencil p = new Pencil();
		System.out.println("Welcome to Pencil Factory");	
		System.out.println("Starting states of Pencil are: ");	

		p.setPs(new WriteState(p));
		p.startstate();
		
		p.setPs(new ColorState(p));
		p.startstate();
		
		p.setPs(new DoCaryons(p));
		p.startstate();
			
		p.setPs(new DoWaterColors(p));
		p.startstate();
		
		System.out.println("Stop States of pencil are: ");	

		
		p.setPs(new WriteState(p));
		p.stopstate();
		
		p.setPs(new ColorState(p));
		p.stopstate();
		
		p.setPs(new DoCaryons(p));
		p.stopstate();

		p.setPs(new DoWaterColors(p));
		p.stopstate();
		
		
	}
}
