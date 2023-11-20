package ru.patterns.homework3.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.io.Serializable;

@Valid
@Getter
@Setter
@NoArgsConstructor
public class SubjectDto implements Serializable {

    private String name;
}
