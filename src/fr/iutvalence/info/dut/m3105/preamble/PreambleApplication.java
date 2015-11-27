package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle(2,3);
		Circle circle1 = new Circle(5);
		circle1.draw(new Position(5, 4));
		rectangle1.draw(new Position(8,2));
	}

}
