package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
public String toString() {
	String return_str ="";
	return_str = "[Rectangle ("+this.width+this.height+")]";
	return return_str;
}
}
