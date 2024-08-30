package Default;
import java.util.Scanner; 

public class User{
  private String name;
  private double amount; 
  
  public User(String n, double a){
    name = n; 
    amount = a; 
  }
  public void deposit(double am){
    amount += am; // increases amount customer has in the bank
    BankSheet.setAssets(am); // Increases bank assets 
    BankSheet.setLiabilities(am); // Increases bank liabilities 
    BankSheet.setReqRes(am * BankSheet.getResReq()); 
    BankSheet.setExRes(BankSheet.getAssets() - BankSheet.getReqRes()); // or assets - (am * (1 / BankSheet.getResReq())) 
  }
  public void withdraw(double am){
    amount -= am; 
  }
  public double getAmount(){
    return amount; 
  }

  public static void main(String[] args){

	Scanner a = new Scanner(System.in); 
	System.out.print("Welcome to BankSmart! Are you a banker (type b) or a customer (type c)?"); 
	String s = a.nextLine(); 
	if (s.equals("c")) {
		
		System.out.println("Hello! Please enter your name:"); 
	    String username = a.nextLine(); 
	    System.out.println("Welcome " + username + "! " + "Enter your starting amount: ");
	    double startAm = a.nextDouble(); 
	    User u = new User(username, startAm); 
	    
	    
	    
	    while (true) {
	    	System.out.println("What action would you like to do? Type 1 to deposit, 2 to withdraw, 3 to view your balance, and 4 to exit."); 
	        int action = a.nextInt();
	        
	        if (action == 1){
	          System.out.println("How much would you like to deposit?"); 
	          double depositAm = a.nextDouble(); 
	          u.deposit(depositAm); 
	        }
	        else 
	          if (action == 2){
	            System.out.println("How much would you like to withdraw?"); 
	            double withdrawalAm = a.nextDouble(); 
	            u.withdraw(withdrawalAm); 
	          }
	        else 
	            if (action == 3){
	              System.out.println("Your amount is " + u.getAmount()); 
	            }
	        else
	          System.out.println("Thank you for using BankingSmart!"); 
	          break; 
	    }
	    }
	else 
		if (s.equals("b")) {
			
			while (true) {
			Scanner b = new Scanner(System.in); 
			System.out.println("Please Enter The Employee Password"); 
			String password = b.nextLine(); // Ask for password
				
			if (password.equals("BankSmart")) { // If password is correct
				break;
			}
			else 
				System.out.println("Password is incorrect *Hint, it's the name of this application (so secure right)*"); 
			} 
			
			Scanner c = new Scanner(System.in); 
			System.out.println("Welcome banker! Which action would you like to do? Type 'a' to access bank sheet items, type 'b' to set bank sheet items"); 
			String action = c.nextLine(); 
			if (action.equals("a")) {
				while (true) {
				
				System.out.println("Type 1 to get assets, type 2 to get liabilities, type 3 to get required reserves, type 4 to get excess reserves, type 5 to exit"); 
				String type = c.nextLine(); 
				if (type.equals("1")) {
					System.out.println(BankSheet.getAssets()); 
				}
				else
					if (type.equals("2")) {
						System.out.println(BankSheet.getLiabilities()); 
					}
					else 
						if (type.equals("3")) {
							System.out.println(BankSheet.getReqRes()); 
						}
						else 
							if (type.equals("4")) {
								System.out.println(BankSheet.getExRes()); 
							}
							else 
								if (type.equals("5")) {
									System.out.print("Thank you for using BankSmart!");
									break;
								}
				}
			}
			else 
				if (action.equals("b")) {
					while (true) {
						
						System.out.println("Type 1 to set assets, type 2 to set liabilities, type 3 to exit");
						String set = c.nextLine(); 
						
						if (set.equals("1")) {
							System.out.println("Enter a number: "); 
							BankSheet.setAssets(Integer.valueOf(c.nextLine()));
						}
						else 
							if (set.equals("2")) {
								System.out.println("Enter a number: "); 
								BankSheet.setLiabilities(Integer.valueOf(c.nextLine()));
							}
							else 
								if (set.equals("3")) {
									System.out.print("Thank you for using BankSmart!");
									break;
								}
						}
					}
		}	
  }
    
}