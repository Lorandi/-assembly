package com.lorandi.assembly.dto;


import com.lorandi.assembly.enums.ElectorStatusEnum;


import jakarta.validation.constraints.NotNull;


public record ElectorUpdateDTO( @NotNull Long id, @NotNull String cpf, ElectorStatusEnum status) {}
