package ru.sber.app.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject{
    private final String name;
    private final List<Grade> grades = new ArrayList<>();
    private Teacher teacher;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name) && Objects.equals(grades, subject.grades) && Objects.equals(teacher, subject.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades, teacher);
    }
}
