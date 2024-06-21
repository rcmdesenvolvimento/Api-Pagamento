package com.rcm.api.pagamentos.repository;

import com.rcm.api.pagamentos.entity.Wallet;
import com.rcm.api.pagamentos.entity.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {

}
