package shapes;

/**
 * @author Raymond Cheung
 * Created 10/16/2017
 * Lab 2.1 shapes
 *
 */

public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	private double semiPerim;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		semiPerim = (a+b+c)/2;
	}

	@Override
	public double calculateArea() {
		return Math.sqrt(semiPerim *(semiPerim-a) * (semiPerim-b) * (semiPerim-c));
	}

	@Override
	public double calculatePerimeter() {
		return a+b+c;
	}
	
    public String toString()
    {
        return "Triangle Side 1: " + a + "Triangle Side 2: " + b + "Triangle Side 3: " + c + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }

}
