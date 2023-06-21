package com.lorandi.assembly.dto;

import com.lorandi.assembly.enums.SurveyStatusEnum;
import jakarta.validation.constraints.NotNull;
public record SurveyUpdateDTO(@NotNull Long id, Long minutes, @NotNull String question, SurveyStatusEnum status) {}
