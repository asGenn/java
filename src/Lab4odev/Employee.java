package Lab4odev;

public class Employee {
	protected String name,surname,tc;

	public Employee(String name, String surname, String tc) {
		this.name = name;
		this.surname = surname;
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}
	public void write() {
		System.out.println(name +" "+surname+" " + tc );
	}
	
	

}
