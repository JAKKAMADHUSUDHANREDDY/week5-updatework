
public class DoWaterColors implements PencilState{

	Pencil pencil;
	
	public DoWaterColors(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void startstate() {
		System.out.println("Please!! Starting to do Water Colors");	
	}

	@Override
	public void stopstate() {
		System.out.println("Please!! Stop Doing Caryons");

	}

}
