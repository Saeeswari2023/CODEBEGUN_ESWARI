package javaPrograms.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ListSetMap {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		int a = 10;
		
		list.add(a);
		list.add(12);
		list.add("Hello");
		list.add(23.5);
		list.add("Hello");
		list.add('A');
		list.add(1023458973l);
		list.add(a);
		list.add(true);
		System.out.println(list.get(1));
		System.out.println("List :: " + list);
		
		Set treeSet = new TreeSet();
		int c = 20;
		
		treeSet.add(c);
		treeSet.add(12);
//		treeSet.add("Hello");
//		treeSet.add(23.5);
//		treeSet.add("Hello");
//		treeSet.add('A');
//		treeSet.add(1023458973l);
//		treeSet.add(c);
//		treeSet.add(true);
		System.out.println("TreeSet :: " + treeSet);
		
		Set set = new HashSet();
		int b = 30;
		
		set.add(b);
		set.add(12);
		set.add("Hello");
		set.add(23.5);
		set.add("Hello");
		set.add('A');
		set.add(1023458973l);
		set.add(b);
		set.add(true);
		System.out.println("HashSet :: " + set);
		
		Set set1 = new HashSet(list);
		//set1.add(list);
		set1.add(10);
		set1.add(30);
		set1.add(70);
		set1.add(90);
		set1.add(50);
		set1.add(00);
		
		System.out.println("List Parameter :: " + set1);
		
		Map<String,String> studentOne = new HashMap<String,String>();
		studentOne.put("id", "2163");
		studentOne.put("name", "Code");
		studentOne.put("email", "code@mail.com");
		studentOne.put("mobileNo", "9800890890");
		studentOne.put("gender", "M");
		
		System.out.println("StOne Id :: " + studentOne.get("id"));
		System.out.println("StOne :: " + studentOne);
		
		Map studentTwo = new HashMap();
		studentTwo.put("id", "2164");
		studentTwo.put("name", "Begun");
		studentTwo.put("email", "begun@mail.com");
		studentTwo.put("mobileNo", "9800890891");
		studentTwo.put("gender", 'M');
		studentTwo.put("id", "2164");
		System.out.println("StudentTwo :: " + studentTwo);
		
		System.out.println("Get :: " + studentTwo.get(2));
		Map<Integer,Map<String,String>> StudentInfo = new HashMap<>();
		StudentInfo.put(2163, studentOne);
		StudentInfo.put(2164, studentTwo);
		System.out.println("Details :: " + StudentInfo.get(2163));
		System.out.println("Details :: " + StudentInfo.get(2164));
		
		System.out.println("Map Data :: " + StudentInfo);
		
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		mapList.add(studentOne);
		mapList.add(studentTwo);
		
		System.out.println("List Of Map :: " + mapList);
	}

}
