import java.util.*;
class Game{
	int number;
	int input;
	Scanner sc = new Scanner(System.in);
	Game(){
		Random rd = new Random();
		this.number=rd.nextInt(50);
	}
	boolean check(){
		System.out.println("Guess the number(1-50):");
		input = sc.nextInt();
		if(input == number){
			System.out.println("You Guessed the correct number.");
			return true;
		}
		else if(input>number){
			System.out.println("Too High..");
		}
		else if(input<number){
			System.out.println("Too Low..");
		}
		else{
			System.out.println("Not guessed..");
		}
		return false;
	}
}
class Task1{
	
	public static void main(String arg[]){
		int guess = 0;
		System.out.println("Number Guessing Game");
		Game g = new Game();
		boolean b = false;
		
		while(!b){
			guess++;
		b= g.check();
		}
		System.out.println("No. of guessess: " + guess);
	}
}