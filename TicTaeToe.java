import java.util.*;

public class TicTaeToe {
	static String arr[][] = new String[4][4];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		initialization();
		printboard();
		
		 String playerName[] = new String[2];
		 String playerChar[] = new String[2];
		 
		 int flag = 0;
		 int count =0;
		 
		 String name ="";
		 String character1="";
		 int a=0;
		 int b=0;
		
		 System.out.print("Enter the 1st player name : ");
         String name1 = s.next();
         playerName[0] = name1;
         System.out.print("\nEnter the 1st player char : ");
		 String name1Char = s.next();
		 playerChar[0] = name1Char;
		 System.out.print("\nEnter the 2nd player name : ");
		 String name2 = s.next();
		 playerName[1] = name2;
		 System.out.print("\nEnter the 2nd player char : ");
		 String name2Char = s.next();
		 playerChar[1] = name2Char;
		 System.out.print("\n"+playerName[0] + " " + playerName[1]);
		 
		 Out: for(;;) {
			 if(flag == 0) {
				 name = playerName[0];
				 character1 = playerChar[0];
				 System.out.println("\n Enter your position "+name);
				 a = s.nextInt();
				 b = s.nextInt();
			 }else {
				 name = playerName[1];
				 character1 = playerChar[1];
				 System.out.println("\n Enter your position "+name);
				 a = s.nextInt();
				 b = s.nextInt();
			 }
			 if(count<=9) {
				if(arr[a][b] == "-") {
					count++;
					if(checkRow(character1, a, b)||checkColumn(character1, a, b)||leftDiagonal(character1, a, b)||rightDiagonal(character1, a, b)) {
						printboard();
	                        System.out.print(name + " is WINNER");
	                        break Out;
					}else {
						printboard();
	                        if (flag == 0) {
	                            flag = 1;
	                        } else {
	                            flag = 0;
	                        }
					}
				}else {
					System.out.println("Invalid Move!");
				}
			 }else {
				 System.out.println("Game Over!");
			 }
		 }
	}
	private static void initialization() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				arr[i][j]="-";
			}
		}

	}
	private static void printboard() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private static boolean checkRow(String character, int a, int b) {
		int check = 0;
        arr[a][b] = character;
        for (int i = 1; i <= 3; i++) {
            if (arr[a][i] == character) {
                check++;
            }
        }
        return check == 3;

	}
	private static boolean checkColumn(String character, int a, int b) {
		int check = 0;
        arr[a][b] = character;
        for (int i = 1; i <= 3; i++) {
            if (arr[i][b] == character) {
                check++;
            }
        }
        return check == 3;

	}
	private static boolean leftDiagonal(String character, int a, int b) {
		int check = 0;
        arr[a][b] = character;
        for (int i = 1; i <= 3; i++) {
            if (arr[i][i] == character) {
                check++;
            }
        }
        return check == 3;

	}
	private static boolean rightDiagonal(String character, int a, int b) {
		int check = 0;
	    for (int i = 1; i <= 3; i++) {
	        if (arr[i][4 - i] == character) {
	            check++;
	        }
	    }
	    return check == 3;

	    
	}
}
