package ru.sber.app.domain;

import java.util.List;
import java.util.Objects;

public class Student {
    private final String name;
    private final List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public double countAverageGrade() {
        return subjects.stream()
                .flatMap(subject -> subject.getGrades().stream())
                .mapToInt(Grade::getValue)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjects);
    }
}
