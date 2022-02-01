package com.naresh.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.naresh.dao.EmployeeDao;
import com.naresh.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate template;
	
	
	public String saveEmployee(Employee emp) {
		String query = "insert into employee values("+"'"+emp.getEmpId()+"'"+","+"'"+emp.getName()+"'"+")";
		System.out.println(query);
		template.execute(query);
		return "Saved Successfully";
	}


	public String deleteEmployee(String empId) {
		int rowCount = template.update("delete from employee where emp_id="+"'"+empId+"'");
		if(rowCount != 0)
			return "Deleted Successfully";
		return "Not Deleted";
	}


	public List<Employee> getAllEmployees() {
		
		List<Employee> list = template.query("select emp_id, name from employee", new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmpId(rs.getString("emp_id"));
					emp.setName(rs.getString("name"));
					list.add(emp);
				}
				return list;
			}
			
		});
		return list;
	}


	public Employee getEmployeeById(String empId) {
		
		Employee emp = template.query("select emp_id, name from employee where emp_id"+"'"+empId+"'", new ResultSetExtractor<Employee>() {

			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmpId(rs.getString("emp_id"));
					emp.setName(rs.getString("name"));
					return emp;
				}
				return null;
			}
			
		});
		return emp;
	}


	public Employee updateEmployee(Employee emp) {
		int rowCount = template.update("insert into employee values("+"'"+emp.getEmpId()+"'"+","+"'"+emp.getName()+"'"+")");
		if(rowCount != 0)
			return emp;
		return null;
	}

}
