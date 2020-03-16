package pzaleszczyk.stringoperations;
import java.util.ArrayList;
import java.util.List;

public class StringOperations {
	
  public String reverse(String a) {
	  //Dodane sprawdzenie czy null
	  if(a == null)
		  return null;
	  List<String> tempArray = new ArrayList<String> (a.length());
	  for (int i=0; i< a.length(); i++) {
		  tempArray.add(a.substring(i, i+1));
	  }
	  StringBuilder reversedString = new StringBuilder(a.length());
	  for (int i = tempArray.size()-1; i>=0; i--) {
		  reversedString.append(tempArray.get(i));
	  }
	  return reversedString.toString();
  }
  
  public String concat(String a, String b) {
	  String retVal = null;
	    if (a != null && a.length() > 0) {
	      StringBuilder sb = new StringBuilder();
	      sb.append(a);
	        if (b != null) {
	          sb.append(b);
	        }
	      retVal = sb.toString();
	    }
	    return retVal;
  }
  
  public boolean isPalindrome(String a) {
	   //Dodane sprawdzenie czy null
	   if(a == null)
		  return true;
	   if(a.length()<=1){
			return true;
		}
	    //Tu mialo byc 0 a nie 1
		if(!(a.charAt(0)+"").equals(a.charAt(a.length()-1)+"")){
			return false;
		}
		//-1 zamiast -2 ..
		return isPalindrome(a.substring(1, a.length()-1));
  }
  
}