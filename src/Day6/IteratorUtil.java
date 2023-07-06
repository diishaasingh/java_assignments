package Day6;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<>();
		cars.add("Mercedes");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Maruti");
	    
	    Iterator<String> it = cars.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    

	}

}
