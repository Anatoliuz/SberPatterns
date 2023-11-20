package ru.patterns.homework3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.patterns.homework3.domain.dto.StudentDto;
import ru.patterns.homework3.service.StudentService;

import javax.validation.Valid;

@RestController("/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping(value = "student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentDto addStudent(@Valid @RequestBody StudentDto studentDto) {
        return studentService.create(studentDto);
    }

}
