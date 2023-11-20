package ru.patterns.homework3.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Valid
@Getter
@Setter
@NoArgsConstructor
public class StudentDto implements Serializable {

    private String id;

    private String name;

    private List<SubjectDto> subjects;

    @NotNull
    @JsonProperty("request-details")
    private RequestDto requestDetails;

}
