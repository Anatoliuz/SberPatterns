package ru.sber.app.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Subject{
    private final String name;
    private final List<Grade> grades = new ArrayList<>();
    private final Teacher teacher;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public List<Grade> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}
