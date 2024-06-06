package br.com.exceptions;

//exceção de fato

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//para setar um status code (404, etc)
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UnsupportedMathOperationException(String ex) {
        super(ex);
    }
}
