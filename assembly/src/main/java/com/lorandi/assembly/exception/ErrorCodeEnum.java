package com.lorandi.assembly.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCodeEnum {

    ERROR_GENERIC_EXCEPTION("error.generic.exception"),
    ERROR_CPF_ALREADY_USED("error.cpf.already.used"),
    ERROR_ELECTOR_NOT_FOUND("error.elector.not.found"),
    ERROR_INVALID_CPF("error.invalid.cpf");

    private final String messageKey;
}
