package com.achille.gestionstock.handlers;

import com.achille.gestionstock.exceptions.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ErrorDto {

    private  Integer httpcode;
    private ErrorCodes code;
    private String message;
    private List<String> errors = new ArrayList<>();
}
