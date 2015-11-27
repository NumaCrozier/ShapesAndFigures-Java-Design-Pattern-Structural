package fr.iutvalence.info.dut.m3105.preamble;

public class BorderDecorator extends ShapeDecorator{
	
	private int thickness;
	
	
	public BorderDecorator(int thickness) {
	
		this.thickness = thickness;
	}
	
	@Override
	public String toString() {
	return this.toString()+"with thickness ("+this.thickness+")";
	}
}
