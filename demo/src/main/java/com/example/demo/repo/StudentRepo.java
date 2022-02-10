package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
