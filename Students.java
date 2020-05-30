public class Student {
	
	private int GPA;
	private String Name;
	private String Address;
	
	public void setGPA (int gpa) {
		GPA = gpa;
	}

	public void setName (String name) {
		Name = name;
	}

	public void setAddress (String address) {
		Address = address;
	}

	public int getGPA() {
		return GPA;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String toString () {
		
		return "GPA no :" +getGPA() + "\n Name:" + getName() + "\n Address:" + getAddress();
		
	}
}
