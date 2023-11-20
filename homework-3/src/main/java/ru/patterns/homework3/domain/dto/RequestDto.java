package ru.patterns.homework3.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Valid
@Getter
@Setter
public class RequestDto implements Serializable {

    @NotNull
    @Length(min = 32, max = 36)
    private String requestUid;

}
