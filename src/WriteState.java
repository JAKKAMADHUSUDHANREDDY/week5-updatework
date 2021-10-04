
public class WriteState implements PencilState{

	Pencil pencil;
	
	public WriteState(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void startstate() {
		System.out.println("Please!! Start writing");	
	}

	@Override
	public void stopstate() {
		System.out.println("Please!! Stop Writing");

	}

}
