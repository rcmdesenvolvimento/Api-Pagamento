package com.rcm.api.pagamentos.controller.dto;

import com.rcm.api.pagamentos.entity.Wallet;
import com.rcm.api.pagamentos.entity.WalletType;

public record CreatePagamentoDto(String NomeCompleto,
                                 String cpfCnpj,
                                 String email,
                                 String password,
                                 WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(NomeCompleto, cpfCnpj, email, password, walletType.get());
    }
}
