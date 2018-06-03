
public class Person {
	protected String name,adress,email,phoneNum;

	Person(){
		
	}
	
	Person(String name,String adress,String email, String phoneNum){
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString(){
		return "Ime: " + this.name
				+"\nAdress: " + this.adress
				+"\nEmail:" + this.email
				+"\nPhone Number: " + this.phoneNum;
	}
}
