package javaPrograms.Details;

public class DetailsMain {

	public static void main(String[] args) {
		SaveInfoMethod saveInfo = new SaveInfoMethod();
		saveInfo.saveUserInfo();
		System.out.println(saveInfo.getBasicInfo());
	}
}
