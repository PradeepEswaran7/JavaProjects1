
public class OperatorDemo {
	public static void main(String[] args) {
		int len=12, width = 10;
		// Arithmetic Operator // composite operator
		int margin=2;
		 len += margin;
		 width -= margin;
		 System.out.println("Length = "+len);
		 System.out.println("Width = "+width);
		 
		//Multiplication division
		 double r =5;
		 double pi = 3.14;
		 double areaOfCircle = pi*r*r;
		 double areaOfSemiCircle = areaOfCircle/2;
		 System.out.println("Area of Circle = "+areaOfCircle);
		 System.out.println("Area of Semi Circle = "+areaOfSemiCircle);
		 
		 // Module
		 int perimeter = 2*(len+width);
		 double areaRemain = perimeter%2;
		 System.out.println("Area Remain = "+areaRemain);
		 // Relational Operator
		 System.out.println("Is Area of  Circle more than 100 = "+(areaOfCircle>100));
		 System.out.println("Is Area of  Circle less than 100 = "+(areaOfCircle<100));
		 System.out.println("Is Area Remain equal to 0 = "+(areaRemain == 0));
		 System.out.println("Is length and width is not match = "+(len != width));
		 
		 // Terinary Operator or Conditional Operator
		 int febDays = 29;
		 System.out.println((febDays) == 29 ? "Leap Year":"Not a Leap Year");
		 
	}
}
