public class Area{
	public void areaCalculate(int x)
	{
		int area;
		area= x*x;
		System.out.println("Area of the square "+area);
	    
	}
	public void areaCalculate(int a, int b)
	{
		int area;
		area= a*b;
		System.out.println("Area of the Rectangle "+area);
	    
	}
	public void areaCalculate(double r)
	{
		double area;
		area= 3.14*r*r;
		System.out.println("Area of the Circle "+area);
	   
	}
	public static void main(String[] args){
		Area a= new Area();
		a.areaCalculate(2);
		a.areaCalculate(50,10);
		a.areaCalculate(9.5);
	}
}