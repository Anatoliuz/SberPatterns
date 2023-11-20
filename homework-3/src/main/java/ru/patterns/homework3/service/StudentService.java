package ru.patterns.homework3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.patterns.homework3.domain.StudentMapper;
import ru.patterns.homework3.domain.dto.StudentDto;
import ru.patterns.homework3.domain.entity.Student;

import javax.validation.constraints.NotNull;

@Validated
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private final StudentMapper mapper;

    public StudentDto create(@NotNull StudentDto studentDto) {
        var student = mapper.studentDtoToStudent(studentDto);
        student = studentRepository.saveAndFlush(student);

        return mapper.studentToStudentDto(student);
    }
}
