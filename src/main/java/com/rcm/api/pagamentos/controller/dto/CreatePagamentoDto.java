package com.rcm.api.pagamentos.controller.dto;

import com.rcm.api.pagamentos.entity.Wallet;
import com.rcm.api.pagamentos.entity.WalletType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreatePagamentoDto(@NotBlank String NomeCompleto,
                                 @NotBlank String cpfCnpj,
                                 @NotBlank String email,
                                 @NotBlank String password,
                                 @NotNull WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(NomeCompleto, cpfCnpj, email, password, walletType.get());
    }
}
