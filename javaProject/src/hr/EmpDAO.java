package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;

	EmpDAO() {
		String path = "config/database.properties";
		Properties prop = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			prop.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Set<String> map = rs.hashmap();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
		
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;

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
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
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

	public Set<Employee> getEmps() {
		String sql = "select * from emp_java";
		Set<Employee> set = new HashSet<>();
		Statment stmt = conn.crateStatment();
		ResultSet rs = stmt.executeQuery(sql);
		try{
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getString("employee_id"));
				emp.setSalary(rs.getString("salary"));
				set.add(emp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}