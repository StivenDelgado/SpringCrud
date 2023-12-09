package com.example.crud.repositorio;

import com.example.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositorio extends JpaRepository<Student, Long> {



}
