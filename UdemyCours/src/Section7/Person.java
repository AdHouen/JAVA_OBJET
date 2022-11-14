package Section7;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public int setAge(int age) {
		if (age == 0 || age > 100) {
			return this.age =0;

		} else {
			return this.age = age;
		}

	}

	public boolean isTeen() {
		if (age > 12 && age < 20) {
			return true;

		} else {
			return false;
		}
	}

	public String getFullName() {
		if (firstName.isEmpty() && lastName.isEmpty()) {
			return "  ";

		}
		if (lastName == null) {
			return this.firstName;
		}

		if (firstName == null) {
			return this.lastName;

		}
		return firstName + " " + lastName;

	}

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName(""); // firstName is set to empty string
		person.setLastName(""); // lastName is set to empty string
		person.setAge(100);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John"); // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith"); // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());

	}

}
