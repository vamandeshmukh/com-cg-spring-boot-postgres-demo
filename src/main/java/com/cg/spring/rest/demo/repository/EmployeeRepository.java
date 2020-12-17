package com.cg.spring.rest.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.spring.rest.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}


// JpaRepository, MongoRepositoty, ... 