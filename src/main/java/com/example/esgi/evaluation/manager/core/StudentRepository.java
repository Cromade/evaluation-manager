package com.example.esgi.evaluation.manager.core;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.esgi.evaluation.manager.core.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
