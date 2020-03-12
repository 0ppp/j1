/* program for usin abstract class as shape */

abstract class shape
{
	double rad,height;
	shape(double r)
	{
		rad=r;
	}
	
	shape(double r,double h)
	{
		rad=r;
		height=h;
	}
	
	abstract double area();
	abstract double volume();
}

class sphere extends shape
{
	sphere(double r)
	{
		super(r);
	}
	
	double area()
	{
		return(4*3.14*rad*rad);
	}

	double volume()
	{
		return(1.33*3.14*rad*rad*rad);
	}
}

class cone extends shape
{
	cone(double r,double h)
	{
		super(r,h);
	}
	
	double area()
	{
		return(3.14*rad*height);
	}
	double volume()
	{
		return(0.33*3.14*rad*rad*height);
	}
}

class cylinder extends shape
{
	cylinder(double r,double h)
	{
		super(r,h);
	}
	
	double area()
	{
		return(2*3.14*rad*height);
	}
	double volume()
	{
		return(3.14*rad*rad*height);
	}
}

class shapepro
{
	public static void main(String as[])
	{
		sphere s=new sphere(2);
		cone c=new cone(2,4);
		cylinder c1=new cylinder(2,4);

		System.out.println("Area of sphere= "+s.area());
		System.out.println("Volume of sphere= "+s.volume());
		
		System.out.println("Area of cone= "+c.area());
		System.out.println("Volume of cone= "+c.volume());

		System.out.println("Area of cylinder= "+c1.area());
		System.out.println("Volume of cylinder= "+c1.volume());
	}
}