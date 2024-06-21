package com.rcm.api.pagamentos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class PagamentoException extends RuntimeException {
    public ProblemDetail toProblemanDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        pb.setTitle("Pagamento internal server error");
        return pb;
    }

}
