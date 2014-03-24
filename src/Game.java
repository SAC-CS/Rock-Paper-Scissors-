import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int computerNum;
		int userNum;
	
		computerNum= 1 + (int) (Math.random()*3);
	
		System.out.println ("Please enter your choice: 1 for Rock, 2 for Paper and 3 for Scissors");
		Scanner input = new Scanner (System.in);
		userNum= input.nextInt();
	
		switch (computerNum) {
		case 1: System.out.println ("The computer choice is Rock");
		break;
		case 2: System.out.println ("The computer choice is Paper");
		break;
		case 3: System.out.println ("The computer choice is Scissors");
		break;
	}
	
		if (computerNum==userNum) {
			System.out.println ("The result is a tie");
		}
		else if (computerNum!=userNum) {
			if (computerNum==1){
				if (userNum==2) {
					System.out.println ("Player won");
					}
				else if (userNum!=2) {
					System.out.println ("Computer won");
				}
			}
			else if (computerNum==2) {
				if (userNum==1) {
					System.out.println("Computer won");
				}
				else if (userNum!=2) {
					System.out.println("Player won");
				}
			}
			else if (computerNum==3) {
				if (userNum==1) {
					System.out.println ("Player won");
				}
				else if (userNum!=1) {
					System.out.println ("Computer won");
				}
			}
			
		}
		
	}

}

// Good job, but the logic is a bit hard to read with 1, 2 and 3
