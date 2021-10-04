
public class ColorState implements PencilState{

	Pencil pencil;
	
	public ColorState(Pencil pencil) {
		this.pencil = pencil;
	}


	@Override
	public void startstate() {
		System.out.println("Please!! Starting to do Colors");	
	}

	@Override
	public void stopstate() {
		System.out.println("Please!! Stop Coloring");

	}

}
