package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = null;

	EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Department[] deptList() {
		PreparedStatement dept = null;
		ResultSet ds = null;
		String sql = "select * from departments";
		Department[] departments = new Department[100];
		try {
			dept = conn.prepareStatement(sql);
			ds = dept.executeQuery();
			int i = 0;
			while (ds.next()) {
				Department dep = new Department();
				dep.setDepartmentID(ds.getInt("department_id"));
				dep.setDepartmentName(ds.getString("department_Name"));
				dep.setLocationID(ds.getInt("location_id"));
				dep.setManagerID(ds.getInt("manager_id"));
				departments[i++] = dep;
				System.out.println(dep.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ds, dept, conn);
		}
		return departments;
	}

	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeID(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_Name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobID(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());
				employees[i++] = emp;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료");
		return employees;
	}
}