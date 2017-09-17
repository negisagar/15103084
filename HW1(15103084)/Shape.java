
interface Shapee{
	 public void numberOfSides();
}
class Trapezoid implements Shapee {
	public void numberOfSides()
	{
		System.out.println("Trapexoid has 4 sides.");
	}

}
class Triangle implements Shapee{
	public void numberOfSides()
	{
		System.out.println("Triangle has 3 sides.");
	}

}

class Hexagon implements Shapee{
	public void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides.");
	}
}


public class Shape{
	public static void main(String[] args)
	{
		Shapee ob1=new Trapezoid();
		Shapee ob2 = new Triangle();
		Shapee ob3=new Hexagon();
		ob1.numberOfSides();
		ob2.numberOfSides();
		ob3.numberOfSides();
	}
}