package com.rcm.api.pagamentos.service;

import com.rcm.api.pagamentos.client.AuthorizationClient;
import com.rcm.api.pagamentos.client.dto.AuthorizationResponse;
import com.rcm.api.pagamentos.controller.dto.TransferDto;
import com.rcm.api.pagamentos.exception.PagamentoException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(TransferDto transfer) {

        var resp = authorizationClient.isAuthorized();

        if (resp.getStatusCode().isError()) {
            throw new PagamentoException();
        }

        return resp.getBody().authorized();
    }
}
