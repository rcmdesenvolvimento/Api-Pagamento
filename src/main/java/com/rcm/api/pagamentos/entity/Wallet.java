package com.rcm.api.pagamentos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_wallet")
@Getter
@Setter
@NoArgsConstructor
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_completo", length = 80)
    private String NomeCompleto;
    @Column(name = "cpf_cnpj", unique = true)
    private String cpfCnpj;
    @Column(name = "email", unique = true, length = 100)
    private String email;
    @Column(name = "password", length = 30)
    private String password;
    @Column(name = "saldo")
    private BigDecimal saldo = BigDecimal.ZERO;
    @ManyToOne
    @JoinColumn(name = "waller_type_id")
    private WalletType walletType;

    public Wallet(String nomeCompleto, String cpfCnpj, String email, String password, WalletType walletType) {
        NomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.password = password;
        this.walletType = walletType;
    }
}
