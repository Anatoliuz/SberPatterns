package ru.sber.app.domain;

import java.util.List;

public interface AverageGradeCalculator extends GradeCalculator {

    double calculate(List<Grade> grades);

}
