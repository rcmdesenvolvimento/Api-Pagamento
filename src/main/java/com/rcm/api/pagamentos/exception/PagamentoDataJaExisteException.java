package com.rcm.api.pagamentos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class PagamentoDataJaExisteException extends PagamentoException {

    private String detail;

    public PagamentoDataJaExisteException(String detail) {
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemanDetail() {

        var pb = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);

        pb.setTitle("Pagamento já existe");

        pb.setDetail(detail);

        return pb;
    }
}
