package javaPrograms.Details;

public class BasicInfo{
	
	public String toString() {
		return "FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age + ", Gender: " + gender + ", MobileNo: " + mobileNo + ", Email: " + email; 
	}
	
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private long mobileNo;
	private String email;
    private AddressInfo address;
	
	public AddressInfo getAddress() {
		return address;
	}
	public void setAddress(AddressInfo address) {
		this.address = address;
	}
	
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
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
