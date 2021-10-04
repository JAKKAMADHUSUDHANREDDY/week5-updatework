
public class Pencil {

	PencilState colorstate;
	PencilState stopcolorstate;
	PencilState writestate;
	PencilState stopwritestate;

	PencilState ps;

	public Pencil()
	{
		colorstate = new ColorState(this);
		stopcolorstate = new DoCaryons(this);
		writestate = new WriteState(this);
		stopwritestate = new DoWaterColors(this);
		
	}

	public PencilState getPs() {
		return ps;
	}

	public void setPs(PencilState ps) {
		this.ps = ps;
	}

	public PencilState getColorstate() {
		return colorstate;
	}

	public PencilState getStopcolorstate() {
		return stopcolorstate;
	}

	public PencilState getWritestate() {
		return writestate;
	}

	public PencilState getStopwritestate() {
		return stopwritestate;
	}

	public void startstate() {
		ps.startstate();
		
	}
	
	public void stopstate() {
		ps.stopstate();
		
	}
	

}
