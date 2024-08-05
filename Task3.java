import java.util.*;
class Atm{
	
	Scanner sc = new Scanner(System.in);
	int amount = 0 ;
	
	void withdraw(){
		System.out.print("Enter the withdrawal amount: Rs. ");
		int wdamt = sc.nextInt();
		if(amount < wdamt || amount == 0){
		System.out.println("\nNot enough amount for withdrawal!\n");			
		}
		else{
			amount -=wdamt;
			System.out.println("\nAmount withdrawed!\n");
			
		}
	}
	
	void deposit(){
		System.out.print("Enter the deposit amount: Rs. ");
		int dpamt = sc.nextInt();
		amount +=dpamt;
		System.out.println("\nAmount Deposited!\n");			
	}
	
	void balance(){
		System.out.println("Your Account balance is: Rs." + amount);
	}
	
	void out(){
		System.out.println("\nThank you for using!\n");
		System.exit(0);
	}
}

class Task3{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		int atm_no=3456, atm_pin = 162;
		System.out.println("Welcome!");
		System.out.print("Enter Your ATM Number: ");
		int atm_num= sc.nextInt();
		System.out.println("Enter your ATM Pin: ");
		int atm_code= sc.nextInt();
		
		if(atm_num ==atm_no && atm_code ==atm_pin){
			while(true){
				System.out.println("\nWhat You want to do?\n1. Withdraw amount \n2. Deposit amount\n3. Check amount\n4. Exit");
				System.out.print("\nEnter Your choise(1-4): ");
				int choise = sc.nextInt();
				switch(choise){
					case 1:atm.withdraw();
					break;
					case 2:atm.deposit();
					break;
					case 3:atm.balance();
					break;
					case 4:atm.out();
					break;
					default:
					System.out.println("Please choose correct option");
				}
			}
		}
		else{
			System.out.println("Enter valid ATM Number or ATM Pin");
		}
	}
}