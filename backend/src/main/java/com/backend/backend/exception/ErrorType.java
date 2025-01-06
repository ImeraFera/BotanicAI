package com.backend.backend.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum ErrorType {

    NO_RECORD_EXIST("1000", "Kayıt Bulunamadı!"),
    GENERAL_EXCEPTION("9999", "Bilinmeyen Bir Hata Oluştu!");

    private String code;
    private String message;

    ErrorType(String code, String message) {

        this.code = code;
        this.message = message;

    }
}
