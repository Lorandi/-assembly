package com.lorandi.assembly.dto;


import java.time.LocalDateTime;
public record SurveyDTO( Long id, LocalDateTime endTime, String question){}
