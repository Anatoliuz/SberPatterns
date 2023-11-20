package ru.patterns.homework3.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.patterns.homework3.domain.entity.Student;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
