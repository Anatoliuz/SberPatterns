package ru.sber.app.domain;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Teacher {
    private final String name;
    private final List<Subject> subjects;

    public Teacher(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return Collections.unmodifiableList(subjects);
    }

}
