	package test.api.springboot.springbootcrudrestapivalidation.repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import test.api.springboot.springbootcrudrestapivalidation.model.Employee;
	
	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	}
