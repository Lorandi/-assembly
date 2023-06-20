package com.lorandi.assembly.dto;

import jakarta.validation.constraints.NotNull;
public record SurveyUpdateDTO(@NotNull Long id, Long minutes, @NotNull String question) {}
