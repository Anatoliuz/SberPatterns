package ru.sber.app.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {
    private final String name;
    private final List<Subject> subjects;
    private final AverageGradeCalculator calculator;

    public Student(String name, List<Subject> subjects, AverageGradeCalculator calculator) {
        this.name = name;
        this.subjects = subjects;
        this.calculator = calculator;
    }

    public double getAverageGrade() {
        List<Grade> allGrades = subjects.stream()
                .flatMap(subject -> subject.getGrades().stream())
                .collect(Collectors.toList());
        return calculator.calculate(allGrades);
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

}
