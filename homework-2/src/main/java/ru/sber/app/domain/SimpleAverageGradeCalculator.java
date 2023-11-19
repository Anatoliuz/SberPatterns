package ru.sber.app.domain;

import java.util.List;

public class SimpleAverageGradeCalculator implements AverageGradeCalculator {

    @Override
    public double calculate(List<Grade> grades) {
        return grades.stream()
                .mapToInt(Grade::getValue)
                .average()
                .orElse(0.0);
    }

}
