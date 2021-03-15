package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {

	public static void main(String[] args) {
		//급여기준 정렬...
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps();
	
		TreeSet<Employee> test = (TreeSet<Employee>) dao.getEmps();
		Iterator<Employee> iter = test.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter = test.iterator();
	}

}
