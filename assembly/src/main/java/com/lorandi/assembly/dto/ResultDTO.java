package com.lorandi.assembly.dto;

import lombok.Builder;

public record ResultDTO(SurveyDTO survey, Long approves, Long reproves, String result) {
    @Builder
    public ResultDTO {};
}
