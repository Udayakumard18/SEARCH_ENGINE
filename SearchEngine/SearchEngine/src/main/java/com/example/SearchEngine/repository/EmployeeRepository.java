package com.example.SearchEngine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.SearchEngine.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	// @Query("SELECT * FROM  employee WHERE (ename  LIKE '%?1%')");
	 // @Query("FROM employee WHERE firstName = ?1")
	
	
//	 @Query("FROM Author WHERE firstName = ?1")
//	    List<Author> findByFirstName(String firstName);
//	 
//	    @Query("SELECT a FROM Author a WHERE firstName = ?1 AND lastName = ?2")
//	    List<Author> findByFirstNameAndLastName(String firstName, String lastName);
//	    
	    
	@Query("SELECT ename FROM Employee  WHERE (ename LIKE '%?1%')")
	
	
	public List<Employee>search(String keyword);
public void StudentfindByEname(String ename);	
}
