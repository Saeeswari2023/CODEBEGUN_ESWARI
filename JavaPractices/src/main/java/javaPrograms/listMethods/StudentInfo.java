package javaPrograms.listMethods;

public class StudentInfo {
	public String toString() {
		return "StId: " + stId + ",StName: " + stName + ",StEmail: " + stEmail + ",StMobile : " + stMobileNo + ",StGender: " + stGender;
	}
	private String stId;
	private String stName;
	private long stMobileNo;
	private String stEmail;
	private char stGender;
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public long getStMobileNo() {
		return stMobileNo;
	}
	public void setStMobileNo(long stMobileNo) {
		this.stMobileNo = stMobileNo;
	}
	public String getStEmail() {
		return stEmail;
	}
	public void setStEmail(String stEmail) {
		this.stEmail = stEmail;
	}
	public char getStGender() {
		return stGender;
	}
	public void setStGender(char stGender) {
		this.stGender = stGender;
	}
}
