package javaPrograms.Details;

public class SaveInfoMethod {

	public StudentInfo saveUserInfo(){
		StudentInfo stInfo = new StudentInfo();
		stInfo.setCollegeName("College Name");
		stInfo.setCourseFee(400000l);
		stInfo.setCourseName("B.Tech");
		stInfo.setBranch("CSC");
		stInfo.setStId("405689");
		stInfo.setBasicInfo(getBasicInfo());
		return stInfo;
	}
	
	public BasicInfo getBasicInfo() {
		BasicInfo basicInfo = new BasicInfo();
		basicInfo.setFirstName("FirstName");
		basicInfo.setLastName("LastName");
		basicInfo.setAge(25);
		basicInfo.setGender('F');
		basicInfo.setMobileNo(9909980990l);
		basicInfo.setEmail("test@test.com");
		basicInfo.setAddress(getAddressInfo());
		
		System.out.println(basicInfo.getFirstName());
		return basicInfo;
	}
	
	public AddressInfo getAddressInfo() {
		AddressInfo address = new AddressInfo();
		address.setdNo("12-21-42/A");
		address.setApartmentName("Apt Name");
		address.setArea("Area");
		address.setCity("City");
		address.setState("State");
		address.setCountry("Country");
		address.setPinCode(123456);
		return address;
	}
}
