package java_data_types;

public class Day22_Employee_Information {
	
	private String name;
	private int ssn;
	private boolean graduated;
	
	public void getGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	public boolean getGraduated() {
		return graduated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
