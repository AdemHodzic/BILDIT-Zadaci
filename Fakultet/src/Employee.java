import java.util.*;
public class Employee {

	protected String office;
	protected double salary;
	protected Date dateHirred = new Date();
	
	public Employee() {
	}
	public Employee (String office, double salary, Date dateHirred){
		this.office = office;
		this.salary = salary;
		this.dateHirred = dateHirred;
	}
	
	public String getOffice(){
		return office;
	}
	public double getSalary(){
		return salary;
	}
	public Date getDateHirred(){
		return dateHirred;
	}
	public void setOffice (String newOffice){
		this.office = newOffice;
	}
	public void setSalary (double newSalary){
		this.salary = newSalary;
	}
	public void setDateHirred(Date newDate){
		this.dateHirred = newDate;
	}
	
	public String toString(){
		return "Office: " + this.office + 
				"\nSalary: " + this.salary + 
				"\nDate hirred" + this.dateHirred;
				
	}

}
