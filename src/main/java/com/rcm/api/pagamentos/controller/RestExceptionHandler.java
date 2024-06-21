package com.rcm.api.pagamentos.controller;

import com.rcm.api.pagamentos.exception.PagamentoException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(PagamentoException.class)
    public ProblemDetail handlePagamentoException(PagamentoException e) {
        return e.toProblemanDetail();
    }


}
