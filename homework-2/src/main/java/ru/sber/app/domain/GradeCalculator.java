package ru.sber.app.domain;

import java.util.List;

public interface GradeCalculator {
    double calculate(List<Grade> grades);
}
