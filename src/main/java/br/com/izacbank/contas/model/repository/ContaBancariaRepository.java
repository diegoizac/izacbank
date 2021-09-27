package br.com.izacbank.contas.model.repository;

import br.com.izacbank.contas.model.entity.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Integer> {
}
