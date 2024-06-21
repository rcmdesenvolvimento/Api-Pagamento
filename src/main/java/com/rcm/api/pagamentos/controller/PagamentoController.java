package com.rcm.api.pagamentos.controller;

import com.rcm.api.pagamentos.controller.dto.CreatePagamentoDto;
import com.rcm.api.pagamentos.entity.Wallet;
import com.rcm.api.pagamentos.service.PagamentoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/pagamentos")
    public ResponseEntity<Wallet> createPagamento(@RequestBody @Valid CreatePagamentoDto dto) {
        var wallet = pagamentoService.createWallet(dto);
        return ResponseEntity.ok(wallet);
    }


}
