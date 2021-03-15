package hr;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {

	public static void main(String[] args) {

		EmpDAO dao = new EmpDAO();

		Map<String, String> map = dao.getJobList();
		map.keySet();

		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, String> ent = iter.next();
			System.out.println("jobId: " + ent.getKey() + "\t" + "jobTitle: " + ent.getValue());

		}
	}

//		
//		
//		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
//		System.out.println("salary가 5000 이상인 사원정보 >> ");
//		
//		for(Employee emp : empList) {
//			if(emp != null && emp.getSalary() > 15000 ) {
//				System.out.println(emp.toString());
//			}
//		}
//
//		Department[] deptList = dao.deptList();
//		System.out.println("------------------------ ");
//
////		System.out.println(dep.toString());
//		
//		for (Department dep : deptList) {
//			if (dep != null && dep.getLocationID() > 1000) {
//				System.out.println(dep.toString());
//			}
//		}
//
//	}

}