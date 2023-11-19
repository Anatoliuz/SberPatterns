package ru.sber.app.domain;

import java.util.Objects;

public class Grade {
    private final int value;

    public Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return value == grade.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
