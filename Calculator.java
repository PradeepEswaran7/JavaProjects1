import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Length");
		System.out.println("2. Area");
		System.out.println("3. Temp");
		System.out.println("4. Exit");
		
		for(;;) {
			System.out.print("\nEnter your Choice : ");
			int choice = input.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("\n Length Conversion");
				System.out.print("\n1. Inch to Meter");
				System.out.print("\n2. Meter to Inch");
				
				System.out.print("\nEnter your Choice : ");
				int lengthChoice = input.nextInt();
					if(lengthChoice == 1) {
						System.out.print("\nEnter the Number to convert Inch to Meter : ");
						double conversionNumber = input.nextDouble();
			            double meters = conversionNumber * 0.0254;
			            int wholeMeters = (int) meters;
			            double remainingCentimeters = (meters - wholeMeters) * 100;

			            System.out.println(conversionNumber + " Inch = " + wholeMeters + " meters " + remainingCentimeters + " centimeters");
					}else {
						System.out.print("\nEnter the Number to Meter Meter to Inch : ");
						int conversionNumber = input.nextInt();
						System.out.println(conversionNumber+" Meter = "+conversionNumber*39.37007874015748+" Inch");
					}
					break;
			case 2 : 
				System.out.println("\n Area Conversion");
				System.out.print("\n1. Square foot to Square meter");
				System.out.print("\n2. Square meter to Square foot");
				
				System.out.print("\nEnter your Choice : ");
				int areaChoice = input.nextInt();
				if(areaChoice == 1) {
					System.out.print("\nEnter the Square foot Number to convert Square meter : ");
					int conversionNumber = input.nextInt();
					System.out.println(conversionNumber+"  Square foot = "+conversionNumber*0.092903+" Square meter");
				}else {
					System.out.print("\nEnter the Square meter Number to convert Square foot : ");
					int conversionNumber = input.nextInt();
					System.out.println(conversionNumber+"  Square meter = "+conversionNumber*10.7639+" Square foot");
				}
				break;
			case 3:
				System.out.println("\n Temperature Conversion");
				System.out.print("\n1. Degree Celsius to Fahrenheit");
				System.out.print("\n2. Fahrenheit to Degree Celsius");
				
				System.out.print("\nEnter your Choice : ");
				int tempChoice = input.nextInt();
				if(tempChoice == 1) {
					System.out.print("\nEnter the Degree Celsius to convert Fahrenheit : ");
					double conversionNumber = input.nextInt();
					System.out.println(conversionNumber+"  Degree Celsius = "+((conversionNumber*9/5)+32)+" Fahrenheit");
				}else {
					System.out.print("\nEnter the Fahrenheit to convert Degree Celsius : ");
					double conversionNumber = input.nextInt();
					System.out.println(conversionNumber+"  Fahrenheit = "+(conversionNumber-32)*5/9+" Degree Celsius");
				}
				break;
			case 4:
				break;
			
			default :
				System.out.println("\n Invalid Move !");
			}
		
		}
	}
	
}
