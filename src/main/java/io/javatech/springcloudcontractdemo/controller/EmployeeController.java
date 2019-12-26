package io.javatech.springcloudcontractdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.javatech.springcloudcontractdemo.model.Employee;
import io.javatech.springcloudcontractdemo.model.EmployeeAddress;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseBody
	public Employee save(@RequestBody Employee employee) {
		employee.setId(111);
		return employee;
	}

	@PatchMapping(value = "/address", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public Employee updateAddress(@RequestBody EmployeeAddress employee) {
		return new Employee(111, "John Clark", 
				employee.getAddress(), 1010101010, "john@testmail.com");
	}

	@GetMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public Employee get(@PathVariable("id") String id) {
		return new Employee(111, "John Clark", 
				"60 S. Race St. Palm Bay, FL 32907", 1010101010, "john@testmail.com");
	}
}
