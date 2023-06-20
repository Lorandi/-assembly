package com.lorandi.assembly.dto;

import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotNull;

@Value
@With
@Jacksonized
@Builder
public class SurveyUpdateDTO {

    @NotNull
    Long id;
    Long minutes;
    @NotNull
    String question;
}
