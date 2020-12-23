package com.training.ust.employee;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;

import com.training.ust.employee.dataacess.EmployeeDAOImpl;

import com.training.ust.employee.exception.EmployeeMgmtException;
import com.training.ust.employee.model.Employee;
import com.training.ust.employee.repo.EmployeeRepo;
import com.training.ust.employee.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class EmployeeServiceTest {

	@InjectMocks
	EmployeeService handler;

	@Mock
	EmployeeRepo repo;

	@Mock
	EmployeeDAOImpl dao;
	private MockMvc mockMvc;
	
	
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testGetAllEmployees() {
		Mockito.when(repo.findAll()).thenReturn(getSampleEmployee());
		List<Employee> empList = handler.getEmployeeList();
		Assert.assertEquals(2, empList.size());
		Assert.assertEquals("rahul", empList.get(0).getEmpName());
	}
	@Test
	public void testAddEmployee() throws Exception {
		
		Mockito.when(repo.save(Mockito.any())).thenReturn(getMonoEmployee());
		Employee empBO = handler.saveEmployee(new Employee());
		Assert.assertEquals("rahul", empBO.getEmpName());
	}
	
	@Test
	public void testsaveBatchEmployee() {
		Mockito.when(repo.saveAll(Mockito.<List<Employee>> any())).thenReturn(
				getSampleEmployee());
		List<Employee> empList = handler.saveBatchEmployee(getSampleEmployeeBOList());
				
		Assert.assertEquals(2, empList.size());
	}

	@Test
	public void testDeleteEmployee() throws EmployeeMgmtException {
      Mockito.when(repo.findById(Mockito.anyString()))
				.thenReturn(getMonoEmployee());
		Mockito.when(repo.delete(Mockito.any())).thenReturn(Mono.empty());
		Employee empBO = handler.deleteEmployee("101").block();
		//Assert.assertEquals("Hiscox", empBO.getAccountName());
	}
	
	 
	@Test(expected = EmployeeMgmtException.class)
	public void testDeleteEmployeeWheNoResponse() {
		Mockito.when(repo.findById(Mockito.anyString())).thenReturn(Mono.empty());
		handler.deleteEmployee("105");
	}
/*	
	
	@Test
	public void testAddBonus() {
		Mockito.when(repo.findById(Mockito.anyString()).thenReturn(getMonoEmployee()));
		Mockito.when(repo.save(Mockito.any())).thenReturn(getMonoEmployee());
		Employee empList = handler.addBonus(new Employee());
		Assert.assertEquals("20", empList.getBonus());
	}
*/
	@Test
	public void testUpdateEmployee() {
		Mockito.when(repo.findById(Mockito.anyString()))
				.thenReturn(getMonoEmployee());
	    Mockito.when(repo.save(Mockito.any())).thenReturn(getMonoEmployee());
		Employee empBO = handler.updateEmployee(new Employee());
		Assert.assertEquals("5", empBO.getExperince());
	}

	@Test
	public void testSearchByAccount() {
		Mockito.when(repo.findByAccountName(Mockito.any())).thenReturn(
				getSampleEmployee());
		List<Employee> employee = handler.getEmpByAccount("101");
		Assert.assertEquals("rahul", employee.get(0).getEmpName());
	}
	
	private Flux<Employee> getSampleEmployee() {
		Employee employee1 = new Employee("101","rahul","Hiscox","2020-11-02",2000.0,5.0,"B",20);
		Employee employee2 = new Employee("103","shibu","Hiscox","2020-11-02",2000.0,5.0,"B",20);
	
		return Flux.just(employee1, employee2);
	}
	private Mono<Employee> getMonoEmployee() {
		Employee employee1 = new Employee("101","rahul","Hiscox","2020-11-02",2000.0,5.0,"B",20);
		return Mono.just(employee1);
	}
	
	private List<Employee> getSampleEmployeeBOList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("101","rahul","Hiscox","2020-11-02",2000.0,5.0,"B",20));
		employeeList.add( new Employee("103","shibu","Hiscox","2020-11-02",2000.0,5.0,"B",20));
		return employeeList;
	}


}
