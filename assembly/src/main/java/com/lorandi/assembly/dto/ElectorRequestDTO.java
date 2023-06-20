package com.lorandi.assembly.dto;


import com.lorandi.assembly.enums.ElectorStatusEnum;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;


@Value
@With
@Jacksonized
@Builder
public class ElectorRequestDTO {

    @NotNull
    String cpf;
    ElectorStatusEnum status;
}
