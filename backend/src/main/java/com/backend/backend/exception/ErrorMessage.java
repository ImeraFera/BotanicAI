package com.backend.backend.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private String ofStatic;
    private ErrorType errorType;

    public String prepareErrorMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append(errorType.getMessage());

        if (this.ofStatic != null) {
            builder.append(" : " + ofStatic);
        }
        return builder.toString();
    }
}
