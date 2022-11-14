package Lab4odev;

public class HourlyEmployee extends Employee {
	protected int hour,wage;

	public HourlyEmployee(String name, String surname, String tc, int hour, int wage) {
		super(name, surname, tc);
		this.hour = hour;
		this.wage = wage;
	}
	public void write() {
		super.write();
		System.out.println("Aylik kazanc " + earning()+" Tl"); 
		
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int earning()
	{
		return wage*hour;
	}
	

}
