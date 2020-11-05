import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Collect {
	public static void main(String[] args) throws IOException 
	{
	//Show how you would use Set to find the unique elements in a List.
		ArrayList<String> names = new ArrayList<String>();
	    names.add("Sarah"); 
	    names.add("Sarah");
	    names.add("Marry");
	    names.add("Bob");
	    names.add("Bob");
	    
	    //By using add all it will not allow for any duplicate values to be added
	    Set<String> unique = new HashSet<String>();
	    unique.addAll(names);
	    
	    
	    
	//Show an example of HashMap and a TreeMap, and explain the difference.
	//Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
	    HashMap<String, Integer> grades = new HashMap<String, Integer>();
	    grades.put("Hope", 100);
	    grades.put("Tim", 89);
	    grades.put("Sarah", 99);
	    
	    TreeMap<String, Integer> gradesTree = new TreeMap<String, Integer>();
	    gradesTree.put("Hope", 100);
	    gradesTree.put("Tim", 89);
	    gradesTree.put("Sarah", 99);
	    
	    //The difference between these is that TreeMap will sort the keys on its own
	    //I would use TreeMap if I needed to guarantee the order
	}
	
}
