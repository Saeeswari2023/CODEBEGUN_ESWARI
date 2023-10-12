package javaPrograms.StringMethods;
import javaPrograms.Details.SaveInfoMethod;

public class StringMain {

	 public static void main(String[] arg) {
	        String str = " Welcome CodeBegun";
	        String str1 = new String(" Welcome CodeBegun");
	        
	        StringBuffer str2 = new StringBuffer("Hello");
	        
	        String subStr = str.substring(0,7).trim();
	        System.out.println("String Substring :: " + subStr);
	        
	        String strReplace = str.replace("e","");
	        System.out.println("String Replace :: " + strReplace);
	        
	        if(str.equals(str1))
	        	System.out.println("Equals Method :: " + true);
	        if(str == str1)
	        	System.out.println("Equal to Operator :: " + true);
	        
	        String strConcat = str.concat(str1);
	        System.out.println("String Concat :: " + strConcat);
	        
	        boolean strContains = str.contains("es");
	        System.out.println("String Contains :: " + strContains);
	        
	        StringBuffer strReverse = str2.reverse();
	        System.out.println("String Reverse :: " + strReverse);
	        
	        int strIndex = str.indexOf('s');
	        System.out.println("String Index :: " + strIndex);
	        
	        String[] strSplit = str.split("code");
	        System.out.println("String Split :: " + strSplit[0]);
	        
	        SaveInfoMethod saveInfo = new SaveInfoMethod();
	        System.out.println("Pin Code :: " + saveInfo.saveUserInfo().getBasicInfo().getAddress().getPinCode());
	    }
}
