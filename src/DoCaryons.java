
public class DoCaryons  implements PencilState{

	Pencil pencil;
	
	public DoCaryons(Pencil pencil) {
		this.pencil = pencil;
	}

	@Override
	public void startstate() {
		System.out.println("Please!! Starting to do Caryons");	
	}

	@Override
	public void stopstate() {
		System.out.println("Please!! Stop doing Caryons");

	}
}