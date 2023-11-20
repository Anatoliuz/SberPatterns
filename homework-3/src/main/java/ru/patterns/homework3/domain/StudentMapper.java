package ru.patterns.homework3.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.patterns.homework3.domain.dto.StudentDto;
import ru.patterns.homework3.domain.entity.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "name", source = "entity.name")
    @Mapping(target = "subjects", source = "entity.subjects")
    StudentDto studentToStudentDto(Student entity);

    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "name", source = "dto.name")
    @Mapping(target = "subjects", source = "dto.subjects")
    Student studentDtoToStudent(StudentDto dto);
}