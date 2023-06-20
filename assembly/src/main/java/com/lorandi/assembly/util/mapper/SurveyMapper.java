package com.lorandi.assembly.util.mapper;

import com.lorandi.assembly.dto.SurveyDTO;
import com.lorandi.assembly.dto.SurveyRequestDTO;
import com.lorandi.assembly.entity.Survey;
import org.mapstruct.Mapper;

@Mapper
public interface SurveyMapper {
    Survey buildSurvey(SurveyRequestDTO requestDTO);

    SurveyDTO buildSurveyDTO(Survey survey);
}
