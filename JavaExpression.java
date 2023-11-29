import java.util.Scanner;
public class JavaExpression {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the length : ");
//		int length = input.nextInt();
//		System.out.print("\nEnter the width : ");
//		int width = input.nextInt();
//		if(length == width) {
//			System.out.println("\nSquare");
//		}else {
//			System.out.println("\nNot a Square");
//		}
//		System.out.print("Enter the side1 : ");
//		int s1 = input.nextInt();
//		System.out.print("\nEnter the side2 : ");
//		int s2 = input.nextInt();
//		System.out.print("\nEnter the side3 : ");
//		int s3 = input.nextInt();
//		if(s1 == s2 && s2 == s3) {
//			System.out.println("\nEquilateral Triangle");
//		}else if(s1 == s2 || s2 ==s3 || s1==s3){
//			System.out.println("\nIsocelus Triangle");
//		}else {
//			if(s3*s3 == (s1*s1)+(s2*s2)||s1*s1 == (s3*s3)+(s2*s2)||s2*s2 == (s3*s3)+(s1*s1)) {
//				System.out.println("\nRightangle Triangle");
//			}else {
//				System.out.println("\nScalene Triangle");
//			}
//			
//		}
		
/*		System.out.print("Enter the Month : ");
		int month = input.nextInt();
		switch(month) {
		case 1:System.out.print("\n January");
		break;
		case 2:System.out.print("\n Feb");
		break;
		case 3:System.out.print("\n Mar");
		break;
		case 4:System.out.print("\n Apr");
		break;
		case 5:System.out.print("\n May");
		break;
		case 6:System.out.print("\n June");
		break;
		case 7:System.out.print("\n July");
		break;
		case 8:System.out.print("\n Aug");
		break;
		case 9:System.out.print("\n Sep");
		break;
		case 10:System.out.print("\n Oct");
		break;
		case 11:System.out.print("\n Nov");
		break;
		case 12:System.out.print("\n Dec");
		break;
		default:System.out.print("\n Invalid Month");
		break;
		}*/
		
/*		System.out.print("Enter the Number to Factorial : ");
		int factNum = input.nextInt();
		int factorial = 1;
		for(int i=factNum;i>=1;i--) {
			factorial *= i;
		}
		System.out.print("\n"+factorial);*/
		
/*		int[] num = {10,20,30};
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.print("\n"+sum);*/
		
/*		int guest = 7;
		for(int i=0;i<=10;i++) {
			if(i == guest) {
				continue;
			}
			System.out.println(i);
		}*/
		
		int age[] = new int[5];
		age[1] = 40;
		
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		for(int a:age) {
			System.out.println("Age : "+a);
		}
		
		input.close();
	}
}
