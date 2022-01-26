package com.naresh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.naresh.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>, JpaSpecificationExecutor<Employee> {
	
	@Query(value="call getEmployee(:empId)", nativeQuery=true)
	public Employee getNamesFromEmployee(@Param("empId") String empId);
	
	//public Employee getEmployeeByName();

}
