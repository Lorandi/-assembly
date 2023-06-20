package com.lorandi.assembly.dto;

import com.lorandi.assembly.enums.ElectorStatusEnum;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

@Value
@With
@Jacksonized
@Builder
public class ElectorDTO {
    Long id;
    String cpf;
    ElectorStatusEnum status;
}
