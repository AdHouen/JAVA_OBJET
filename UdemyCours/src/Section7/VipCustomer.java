package Section7;

public class VipCustomer {

	
	private String nameString;
	private double creditLimit;
	private String emailAdress;

	public String getNameString() {
		return nameString;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAdress() {
		return emailAdress;
	}
	
	
	public VipCustomer(String nameString, double creditLimit, String emailAdress) {
		super();
		this.nameString = nameString;
		this.creditLimit = creditLimit;
		this.emailAdress = emailAdress;
	}
	public VipCustomer(String nameString, String emailAdress) {
		this(nameString, 0 ,emailAdress);
		
	}
	
	public  VipCustomer() {
		this("Name_Unknow", 50000.00, "No_Email");
		
	}
	
	
	@Override
	public String toString() {
		return "Nom : " + nameString + "\nCreditLimit : " + creditLimit + "\nEmailAdress : " + emailAdress;
	}
	

	public static void main(String[] args) {
		
		VipCustomer adrienVipCustomer = new VipCustomer("Adrien", 1253, "adrien@mail.fr");
		
		System.out.println(adrienVipCustomer);
		System.out.println(adrienVipCustomer.getNameString());

	}

	
		
	
}
