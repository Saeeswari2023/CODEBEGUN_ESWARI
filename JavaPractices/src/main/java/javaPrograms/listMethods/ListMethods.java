package javaPrograms.listMethods;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListMethods {

	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo();
		st1.setStId("2163");
		st1.setStName("Code");
		st1.setStEmail("code@gmail.com");
		st1.setStMobileNo(9808809808l);
		st1.setStGender('M');
		
		StudentInfo st2 = new StudentInfo();
		st2.setStId("2164");
		st2.setStName("Begun");
		st2.setStEmail("begun@gmail.com");
		st2.setStMobileNo(9808809008l);
		st2.setStGender('M');
		
		List<StudentInfo> list = new LinkedList<StudentInfo>();
		list.add(st1);
		list.add(st2);
		list.remove(st1);
//		list.removeAll(list);
		list.clear();
		
		for(StudentInfo st:list) {
			st.getStId();
			st.getStName();
			st.getStEmail();
			st.getStMobileNo();
			st.getStGender();
			System.out.println("Student Info :: ");
			System.out.println(st.toString());
		}
		
		Map<String,StudentInfo> map = new HashMap<String,StudentInfo>();
		map.put("StudentOne", st1);
		map.put("StudentTwo", st2);
		System.out.println();
		for(Map.Entry<String, StudentInfo> entry:map.entrySet()) {
			System.out.println(entry.getKey() +" = "+ entry.getValue());
		}
	}

}