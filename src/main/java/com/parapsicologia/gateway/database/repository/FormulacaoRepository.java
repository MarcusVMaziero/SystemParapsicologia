package com.parapsicologia.gateway.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parapsicologia.gateway.database.repository.entity.FormulacaoTable;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulacaoRepository extends JpaRepository<FormulacaoTable, Long>{
}
