package Collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int [3];  // static array---fixed size---normal array

		ArrayList ar = new ArrayList(); //This is how ArrayList is created
		
		ar.add(99);
		ar.add(88);
		ar.add("Hi");
		ar.add(3.678);
		
	System.out.println("Sixe of ArrayList is"+ ar.size() );
	
	System.out.println("Value at index 3 is "+ ar.get(3));
	
	ar.add("jdfhu");
	
	System.out.println("New size is "+ ar.size());	
	
	System.out.println(ar.remove(4));
	
	System.out.println(ar.size());
	
	/*we are getting warning signs in this program bcoz we did not mention any data types which
	 is generally expected in java*/
	 
	// To print all the values in a sequence, use for loop
	
	for(int i=0; i<ar.size();i++)
		
	{   System.out.println(ar.get(i));
	
	}
		
	ArrayList<Integer> ar1 = new ArrayList<Integer>(); //Generic
	ar1.add(23);
//	ar1.add(67.7);         // Error bcoz value is not integer
	//ar1.add("Hey");     // Same 	
	// IN the same way we can add different data types in angular brackets
	
	/* If we want to add heterogenous data types in a generic arraylist the, create another class, constructor and define
	   the variables there..come back here and create an object, create an arraylist here and give that 
	   obj as the parameter for this arraylist */
	
	EmployeeArrayList e1 = new EmployeeArrayList("Hari",45,252.34);
	EmployeeArrayList e2 = new EmployeeArrayList("Nandu",878,2548.369);
	
	ArrayList<EmployeeArrayList> ar2 = new ArrayList<EmployeeArrayList>();
	
	ar2.add(e1);
	ar2.add(e2);
	
	System.out.println("Value at index 1 is" + ar2.get(1));
	
	
	
		
		
	}

}
