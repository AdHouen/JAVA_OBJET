package Section7;

public class BankAccount {

	private String accNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount() { //Aucun parametre sont  rentrés 
		this("123456789", 0, "customerName Empty", "noName@email", "01234567"); /// donc il y aura ceci par defaut
		System.out.println("Empty constructor called");
		
	}
	
	public BankAccount(String accNumber, double balance, String customerName, String email, String phoneNumber) {
		
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
	}

	public void deposit(double deposit) {
		this.balance += deposit;
		System.out.println("Vous avez deposé la somme de " + deposit + "processes . New balance = " + this.balance);

	}

	public void withdraw(double withdraw) {

		if (withdraw > balance) {
			System.out.println("Impossible d'effectuer cette transaction");

		} else {
			this.balance -= withdraw;
			System.out.println("Withdrawal of " + withdraw + " processes . Remaining balance = " + this.balance);
		}

	}

	public String getAccNumber() {
		return this.accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	


	public static void main(String[] args) {
		
		
		////// AU DEBUT  on peut faire ca comme ca /////

		BankAccount adrienAccount = new BankAccount();

		adrienAccount.setAccNumber("235424457");
		adrienAccount.setBalance(1235);
		adrienAccount.setCustomerName("Adrien");
		adrienAccount.setEmail("adfjfjf@kakaka.com");
		adrienAccount.setPhoneNumber("0612345678");

		System.out.println("La balance du compte est de " + adrienAccount.balance);
		adrienAccount.withdraw(124);
		System.out.println(adrienAccount.balance);
		
		////// APRES  on peut faire ca comme ca une fois que les parametres sont definis /////
		
		BankAccount adrienAccount2 = new BankAccount("235424457", 12345, "Adrien","adfjfjf@kakaka.com","0612345678");
		
		

		
		
	}

}
