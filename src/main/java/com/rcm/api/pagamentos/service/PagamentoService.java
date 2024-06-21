package com.rcm.api.pagamentos.service;

import com.rcm.api.pagamentos.controller.dto.CreatePagamentoDto;
import com.rcm.api.pagamentos.entity.Wallet;
import com.rcm.api.pagamentos.exception.PagamentoDataJaExisteException;
import com.rcm.api.pagamentos.repository.WalletRepository;
import com.rcm.api.pagamentos.repository.WalletTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    private final WalletRepository walletRepository;

    public PagamentoService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreatePagamentoDto dto) {

        //var walletDb = walletRepository.findCPFCnpjEmail(dto.cpfCnpj(), dto.email());
        var walletdb = this.walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());

        if (walletdb.isPresent()) {
            throw new PagamentoDataJaExisteException("CPFCNPJ ou Email já existem");
        }

        return walletRepository.save(dto.toWallet());
    }
}
