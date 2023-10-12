package javaPrograms.Details;

public class StudentInfo {
	private String stId;
	private String courseName;
	private long courseFee;
	private String collegeName;
	private String branch;
	private BasicInfo basicInfo;
	
	public BasicInfo getBasicInfo() {
		return basicInfo;
	}
	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(long courseFee) {
		this.courseFee = courseFee;
	}
}
