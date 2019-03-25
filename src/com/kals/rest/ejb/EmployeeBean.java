package com.kals.rest.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.kals.rest.model.Employee;

@Path("/employee")
@Stateless
@LocalBean
public class EmployeeBean {
	
	@GET
	@Path("/employees")
	@Produces("application/json")
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Management", 1000.0));
		employees.add(new Employee(102, "Accounts", 2000.0));
		return employees;
	}

}
