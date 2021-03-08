package hr;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Employee[] empList = dao.empList();
		System.out.println("salary가 5000 이상인 사원정보 >> ");
		
		for(Employee emp : empList) {
			if(emp != null && emp.getSalary() > 15000 ) {
				System.out.println(emp.toString());
			}
		}

		Department[] deptList = dao.deptList();
		System.out.println("------------------------ ");

//		System.out.println(dep.toString());
		
		for (Department dep : deptList) {
			if (dep != null && dep.getLocationID() > 1000) {
				System.out.println(dep.toString());
			}
		}

	}
}