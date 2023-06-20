package com.lorandi.assembly.dto;


import com.lorandi.assembly.enums.ElectorStatusEnum;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import jakarta.validation.constraints.NotNull;

@Value
@With
@Jacksonized
@Builder
public class ElectorUpdateDTO {
    @NotNull
    Long id;
    @NotNull
    String cpf;
    ElectorStatusEnum status;
}
